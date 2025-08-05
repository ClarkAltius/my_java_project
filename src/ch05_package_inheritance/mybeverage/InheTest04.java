package ch05_package_inheritance.mybeverage;

public class InheTest04 {
    public static void main(String[] args) {
        //promotion : Subclass temporarily cast into the superclass's type. aka upcasting
        Beverage04 ameka = new Americano04("'Merika!", 4000.0, 250.0);
        System.out.println(ameka.toString());
        //due to the promotion, the subclass object can access the methods inside the superclass.
        ameka.showInfo();
        Americano04 ame = (Americano04) ameka;
        ame.sipAmericano(); //Through demotion, the object gains access to methods in the subclass.



        Beverage04 esp = new Espresso04("Espressssso", 3000.0, 4);
        esp.showInfo();
        Espresso04 esprrr = (Espresso04) esp;
        esprrr.gulpEspresso();

        Beverage04 lat = new Latte04("Soy Latte", 5500.0, "Soy");
        lat.showInfo();
        Latte04 latte = (Latte04) lat;
        latte.showinfo();
        latte.enjoyLatte();

        //let's try using the idea of promotion and arrays at the same time.
        //array reset : type[] arrayName = {parameter 1, parameter 2, ... ]

        Beverage04[] beverage = {
                ameka,
                new Espresso04("Espresha", 3000.0, 4),
                new Latte04("Water Latte", 59500.0, "Watah")
        };
        for (int i = 0; i < beverage.length; i++) {
            System.out.println("____________");
            beverage[i].showInfo();
            System.out.println(beverage[i].toString());

            if(beverage[i] instanceof Americano04){
                Americano04 xxx = (Americano04) beverage[i];
                xxx.sipAmericano();
            } else if (beverage[i] instanceof Espresso04) {
                Espresso04 yyy = (Espresso04) beverage[i];
                yyy.gulpEspresso();
            } else if (beverage[i] instanceof Latte04) {
                Latte04 zzz = (Latte04) beverage[i];
                zzz.enjoyLatte();
            }else{
                System.out.println("Unknown Drink Type");
            }
        }


    }
}
