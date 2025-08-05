package ch05_package_inheritance.animals;

public class Lion05 extends Animal05 {
    //subclass. needs variable leg
    private int leg;
    public Lion05(String name, double lifespan, String habitat, double speed, int leg){
        super(name, lifespan, habitat, speed); //get what I need from super
        this.leg = leg;
    }
    @Override
    public void showInfo() {
        String message;
        super.showInfo();
        message = "The " + super.getName() + " has " + leg + " legs";
        System.out.println(message);
        return;
    }

    public void run(){
        System.out.println("It runzzzzzzzz!");

    }
}
