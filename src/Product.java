public class Product {
    private String name;
    private int produced1;
    private int sold1;
    private int produced2;
    private int sold2;
    private double demand1;
    private double demand2;
    private double avgDemand;

    public Product(String name, int produced1, int sold1, int produced2, int sold2){
        this.name=name;
        this.produced1=produced1;
        this.sold1=sold1;
        this.produced2=produced2;
        this.sold2=sold2;
        this.demand1=(this.sold1*1.0)/this.produced1;
        this.demand2=(this.sold2*1.0)/this.produced2;
        this.avgDemand=(this.demand1+this.demand2)/2;
    }

    public double getAvgDemand() {
        return avgDemand;
    }

    public void setAvgDemand() {
        this.avgDemand = (this.demand1+this.demand2)/2;
    }

    public double getDemand1() {
        return demand1;
    }

    public void setDemand1(double demand1) {
        this.demand1 = demand1;
    }

    public double getDemand2() {
        return demand2;
    }

    public void setDemand2(double demand2) {
        this.demand2 = demand2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProduced1() {
        return produced1;
    }

    public void setProduced1(int produced1) {
        this.produced1 = produced1;
    }

    public int getSold1() {
        return sold1;
    }

    public void setSold1(int sold1) {
        this.sold1 = sold1;
    }

    public int getProduced2() {
        return produced2;
    }

    public void setProduced2(int produced2) {
        this.produced2 = produced2;
    }

    public int getSold2() {
        return sold2;
    }

    public void setSold2(int sold2) {
        this.sold2 = sold2;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", produced1=" + produced1 +
                ", sold1=" + sold1 +
                ", produced2=" + produced2 +
                ", sold2=" + sold2 +
                ", demand1=" + demand1 +
                ", demand2=" + demand2 +
                ", avgDemand=" + avgDemand +
                '}';
    }
}
