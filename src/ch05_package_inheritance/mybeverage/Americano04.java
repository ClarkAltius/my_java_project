package ch05_package_inheritance.mybeverage;


public class Americano04 extends Beverage04 {
    private double waterAmount;

    @Override
    public String toString() {
        String message = "water" + this.waterAmount;
        return message;
    }

    //now let's make a method representing taking sips.
    public void sipAmericano(){
        String message = "Take a sip!";
        System.out.println(message);
    }

    public Americano04(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }


}
