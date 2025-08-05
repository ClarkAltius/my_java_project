package ch05_package_inheritance.animals;

public class Animal05 {
    //This is the superclass. Variables (name, lifespan, habitat, speed.
    private String name;
    private double lifespan;
    private String habitat;
    private double speed;

    //I now need the constructor.
    public Animal05(String name, double lifespan, String habitat, double speed){
        this.name = name;
        this.lifespan = lifespan;
        this.habitat = habitat;
        this.speed = speed;
    }

    //I also need a method that would print the values.

    public void showInfo(){
        System.out.printf("The animal " + name);
        System.out.printf(" lives in the " + habitat);
        System.out.println(", and has an average lifespan of " + lifespan + " years.");
        System.out.println("The " + name + " travels at the speed of " + speed + " mph.");

    }

    //I also need a getter for names
    public String getName(){
        return name;
    }

}
