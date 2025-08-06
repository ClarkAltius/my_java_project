package ch06_abstract_interface.myshape.beveragetest;
//0. this is my abstract class. It can have variables but the methods are not allowed to have a body.

public abstract class Beverage01 { //1. I start by adding the abstract in front of the class.


    //2. Now, I start adding universal variables which will be used in all of the subclasses. It will be name and price. I want the ease of accessing it without making getters and setters so I'll set it to protected instead of private. is this good practice? check up later. revision: apparently protected isn't a good practice when it comes to abstrac classes. I'll set it to private instead.
    private String name;
    private double price;

    //3. The next step is to define the abstract methods (contracts? Interfaces?) which will be overriden by the subclasses. They are 'drink' and 'make'.
    public abstract String drink();
    public abstract String make();
    //4. I want another method that will print the specifics.

    //revision: because I want to display these for every subclass, making it abstract isn't necessary.
    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
    }

    //5. I need a constructor which can be used to instantiate the objects.
    public Beverage01(String name, double price){
        this.name = name;
        this.price = price;
    }

    //12. I need getters for the main variables.
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
