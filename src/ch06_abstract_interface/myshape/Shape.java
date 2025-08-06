package ch06_abstract_interface.myshape;

public abstract class Shape {
    private String lineColour;
    private String fillColour;
    protected double area;
    protected double perimeter;

    //methods. it is abstract so it lacks the body.
    public abstract double calcArea();
    public abstract double calcPerimeter();
    public abstract void display();

    //the final prevents the subclasses from overriding this method.
    protected final void draw (){
        System.out.println("Line Colour : " + lineColour);
        System.out.println("Fill Colour : " + fillColour);
    }

    public Shape(String lineColour, String fillColour){
        this.lineColour = lineColour;
        this.fillColour = fillColour;
    }


}
