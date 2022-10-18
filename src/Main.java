import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products=new ArrayList<Product>();
        products.add(new Product("scaune", 95, 95, 95, 95));
        products.add(new Product("mese", 32, 23, 87, 36));
        products.add(new Product("paturi", 72, 29, 92, 83));

        products.sort(Comparator.comparing(Product::getAvgDemand));
        System.out.println(products);
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
            System.out.println(riseProd.getName() + " " + Math.floor(riseProd.getProduced1()*1.5));
        }
        System.out.println("stagnated:");
        for (Product stagnateProd : stagnated){
            System.out.println(stagnateProd.getName() + " " + Math.floor(stagnateProd.getProduced1()*1.1));
        }
        System.out.println("falling:");
        for (Product fallProd : falling){
            System.out.println(fallProd.getName() + " " + Math.floor(fallProd.getProduced1()*0.9));
        }
    }
}