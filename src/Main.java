import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products=new ArrayList<Product>();
        products.add(new Product("name1", 4, 2, 5, 2));
        products.add(new Product("name2", 32, 23, 87, 36));
        products.add(new Product("name2", 72, 29, 92, 83));

        products.sort(Comparator.comparing(Product::getAvgDemand));
        fitToCategory(products);
    }

    public static void fitToCategory(List<Product> products){
        List<Product> rising=new ArrayList<Product>();
        List<Product> stagnated=new ArrayList<Product>();
        List<Product> falling=new ArrayList<Product>();
        for (Product product : products) {
            if (product.getDemand1() > product.getDemand2()) {
                rising.add(product);
            }
            if (product.getDemand1() == product.getDemand2()) {
                stagnated.add(product);
            }
            if (product.getDemand1() < product.getDemand2()) {
                falling.add(product);
            }
        }

        System.out.println("rising:");
        for (Product riseProd : rising){
            System.out.println(riseProd.getDemand1()*2);
        }
        System.out.println("stagnated:");
        for (Product stagnateProd : stagnated){
            System.out.println(stagnateProd.getDemand1()*0.1);
        }
        System.out.println("falling:");
        for (Product fallProd : falling){
            System.out.println(fallProd.getDemand1()/0.1);
        }
    }
}