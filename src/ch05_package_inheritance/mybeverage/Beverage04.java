package ch05_package_inheritance.mybeverage;

public class Beverage04 {
    private String name;
    private double price;

    public Beverage04(){}

    public String getName() {
        return name;
    }

    //method hiding. when overriding, we hide the method in the super class.
    @Override  //the line starting with @ is known as annotation
    public String toString() {
        return "Beverage04{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Beverage04(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void showInfo(){
        System.out.println("\nName : " + name);
        System.out.println("price : " + price);
    }
}
