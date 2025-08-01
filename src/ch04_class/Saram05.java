package ch04_class;

public class Saram05 {
    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;


    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
        System.out.println("Hobby : " + hobby);
        System.out.println("Blood : " + blood);
    }

    public Saram05(String name, double height, double weight, String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = "Lore of Shyish";
        this.blood = blood;
    }

    public Saram05(String name, double height, double weight, String hobby, String blood){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;
    }
}
