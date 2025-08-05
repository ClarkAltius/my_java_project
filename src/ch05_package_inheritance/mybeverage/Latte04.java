package ch05_package_inheritance.mybeverage;

import ch02_control_statements.LargeTest;

public class Latte04 extends Beverage04 {
    private String milkType;

    @Override
    public String toString() {
        String message = "Milk Type L " + milkType;
        return super.toString() + message;
    }

    public Latte04(String name, double price, String milkType){
        super(name, price);
        this.milkType = milkType;
    }
        public void showinfo(){
        super.showInfo();
        System.out.println("Milk : " + milkType);
    }


    public void enjoyLatte() {
        System.out.println("Chug Chug Chug Chug!");
    }
}
