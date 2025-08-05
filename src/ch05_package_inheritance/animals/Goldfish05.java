package ch05_package_inheritance.animals;

public class Goldfish05 extends Animal05 {
    //subclass 1. needs variable gill
    private int gill;

    //I need a method that would allow creating goldfish with gill variable too.
    public Goldfish05(String name, double lifespan, String habitat, double speed, int gill){
        super(name, lifespan, habitat, speed); //get what I need from super
        this.gill = gill;
    }
    public int getGill() {
        return gill;
    }

    //I now need a method that would add the gill info to the superclass's showinfo.


    @Override
    public void showInfo() {
        String message;
        super.showInfo();
        message = "The " + super.getName() + " has " + gill + " gills";
        System.out.println(message);
    }

    public void swim(){
        System.out.println("It swimzzzzzzz!");
    }
}
