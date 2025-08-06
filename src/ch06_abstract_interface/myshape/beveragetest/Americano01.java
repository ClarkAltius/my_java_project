package ch06_abstract_interface.myshape.beveragetest;
//6. this is the first subclass. Make it one by adding extends. I'll only add the variables unique to this subclass.
public class Americano01 extends Beverage01 {
    private double waterAmount;

    //9. now , I need a constructor for each of the subclasses which will be used to override the one in the superclass.
    public Americano01(String name, double price, double waterAmount){
        super(name, price);
        this.waterAmount = waterAmount;
    }
    //10. I also need the methods drink, make and display. Because I don't like the way I'm getting error notifications, I'll make placeholders first before filling them out. I'll add @Override too.

    @Override
    public String drink(){
        String message = "Take a good sip of the " + super.getName();
        return message;
    }
    @Override
    public String make(){
        return "Brew the Espresso and add it to hot water!";
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Water : " + this.waterAmount);
    }
}
