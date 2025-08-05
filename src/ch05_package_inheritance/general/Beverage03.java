package ch05_package_inheritance.general;

public class Beverage03 {
    private String name; //name, duh
    private double price; //prices. duh

    //접근지정자 반환타입 생성자이름(매개변수)
    //access modifier return type constructor(parameter)
    public Beverage03(String name, double price){
        this.name = name;
        this.price = price;

    }

    protected void showInfo() {
        System.out.println("Cucumba Name " + this.name);
        System.out.println("Cucumba nambah " + this.price);
    }
}
