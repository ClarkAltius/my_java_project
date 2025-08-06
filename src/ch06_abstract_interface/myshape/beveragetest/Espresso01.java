package ch06_abstract_interface.myshape.beveragetest;
//8. this is the third subclass. I'll only add the variables unique to this subclass.
public class Espresso01 extends Beverage01 {
    private int shots;
    //9. cont.
    public Espresso01(String name, double price, int shots){
        super(name, price);
        this.shots = shots;
    }
    //10.cont
    @Override
    public String drink(){
        String message = "Gulp it up! It's literally a sip.";
        return message;
    }
    @Override
    public String make(){
        String message = "Coffee, but little of it. Technically it involves making steam go through finely ground beans but whatever";
        return message;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Shots : " + shots);
        return;
    }
}
