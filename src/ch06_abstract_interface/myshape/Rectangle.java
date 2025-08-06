package ch06_abstract_interface.myshape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String lineColour, String fillColour, double height, double width){
        super(lineColour, fillColour);
        this.width = width;
        this.height = height;
    }

    //this is the implementation. It overrides the empty abstract method in the superclass.
    @Override
    public double calcArea() {
        double areaRectangle = this.width * this.height;
        return areaRectangle;
    }
    public double calcPerimeter() {
        double rectanglePerimeter = height * 2 + width * 2;
        return rectanglePerimeter;
    }
    public void display(){
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();
        System.out.println("Rectangle");
        System.out.println("Area : " + super.area);
        System.out.println("Perimeter : " + super.perimeter);
    }
}
