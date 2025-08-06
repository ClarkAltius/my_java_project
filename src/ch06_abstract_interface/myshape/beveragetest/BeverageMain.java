package ch06_abstract_interface.myshape.beveragetest;

public class BeverageMain {
    public static void main(String[] args) {
        //13. let's instantiate objects and do some executions. because Beverage01 is abstract it cannot be instantiated directly. We instantiate the subclasses instead. Let's arrrrrrray this.
        Beverage01[] beverages = {
          new Americano01("Amerika-No",7000.0,400.0),
          new Latte01("Banal-Latte", 9000.0, "Banana"),
          new Espresso01("Express-Thor", 12000.0, 5)
        };

        for (int i = 0; i < beverages.length; i++) {
            System.out.println("==============");
            beverages[i].display();
            System.out.println(beverages[i].make());
            System.out.println(beverages[i].drink());
        }
    }
}
