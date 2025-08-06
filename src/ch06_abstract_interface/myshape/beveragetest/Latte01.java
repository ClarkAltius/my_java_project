package ch06_abstract_interface.myshape.beveragetest;
//7. this is the second subclass. I'll only add the variables unique to this subclass.
public class Latte01 extends Beverage01{
    private String milkType;

    //9. continued
    public Latte01(String name, double price, String milkType){
        super(name, price);
        this.milkType = milkType;
    }
    //10.cont
    @Override
    public String drink(){
        String message = "Chug the Latte like there is no tomorrow!";
        return message;
    }
    @Override
    public String make(){
        String message = "Latte is literally milk. Add it to the coffee";
        return message;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Milk Type : " + milkType);
        return;
    }
}
