package ch05_package_inheritance.general;

public class InheTest03 {
    public static void main(String[] args) {
        //let's get to making the objectives!

        Americano03 americano = new Americano03("Americano", 4000.0, 200.0);
        Espresso03 espresso = new Espresso03("Espresso Triple", 5000.0,3);
        Latte03 latte = new Latte03("latte", 5500.0, "Soy");

        americano.printInfo();
        espresso.printInfo();
        latte.printInfo();

    }


}
