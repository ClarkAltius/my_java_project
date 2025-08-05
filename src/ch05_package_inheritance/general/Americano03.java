package ch05_package_inheritance.general;

// Subclass exctends Superclass
public class Americano03 extends Beverage03 {
    private double waterAmount;
    //change signature??
    public Americano03(String name, double price, double waterAmount){
//        super(); //this calls the parent's constructor. but even without it written out explicitly, it will do the same.
        super(name, price);
        this.waterAmount = waterAmount;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("Cucumba Watah" + this.waterAmount);
    }
}
