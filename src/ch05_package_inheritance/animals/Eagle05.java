package ch05_package_inheritance.animals;

public class Eagle05 extends Animal05{
    //subclass. needs variable wings.
    private int wing;
    public Eagle05(String name, double lifespan, String habitat, double speed, int wing) {
        super(name, lifespan, habitat, speed); //get what I need from super
        this.wing = wing;
    }

    @Override
    public void showInfo() {
        String message;
        super.showInfo();
        message = "The " + super.getName() + " has " + wing + " wings";
        System.out.println(message);
        return;
    }

    public void fly(){
        System.out.println("It Flyzzzzzzzzz");

    }
}
