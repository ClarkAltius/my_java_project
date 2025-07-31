package ch04_class;

public class Saram02 {
    //Static variable, for other classes to use. Static variable = class variable = 정적 변수
    static String nationality = "Kislev";
    //instance variables, for this class only
    String name;
    double height;
    double weight;
    String hobby;
    String blood;

    // double PI = 3.14; This shouldn't change. in order to keep it that way, we use final
    final double PI = 3.14; //the final turns this float into a constant


    public void display() { //member method to show the variables
        //PI = 5.14; this would have overriden double PI, but the final double PI stops it from happening
        int total = 0;

        for (int i = 0; i < 11; i++) {
            total += 1;
        }

        System.out.println("total : " + total);

        System.out.println("Fealty : " + nationality);
        System.out.println("Name : " + name);
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
        System.out.println("Hobby : " + hobby);
        System.out.println("Blood : " + blood);

    }
}
