package ch05_package_inheritance.mybeverage;

import javax.xml.namespace.QName;

public class Espresso04 extends Beverage04{
    private int shotCount;

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(shotCount + " shots plzzzzz!");
    }

    public Espresso04(String name, double price, int shotCount){
        super(name, price);
        this.shotCount = shotCount;
    }

    public void gulpEspresso(){
        System.out.println("You take a gulp of the drink " + super.getName());
    }

    }
