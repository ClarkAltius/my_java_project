package ch05_package_inheritance.general;

public class Espresso03 extends Beverage03 {
    private int shot;
    public Espresso03(String name, double price, int shot){
        super(name, price);
        this.shot = shot;
    }
    public void printInfo(){
        super.showInfo();
        System.out.println("SHOTSHOTSHOTSHOTSTHO " + shot);
    }
}
