package ch06_abstract_interface.myshape;

public class Circle extends Shape {
    private double radius;
    private double xpos;
    private double ypos;

    public Circle(String lineColour, String fillColour, double radius, double xpos, double ypos){
        super(lineColour, fillColour);
        this.radius = radius;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    @Override
    public double calcArea() {
        double areaCircle = (this.radius * this.radius) * Math.PI;
        return areaCircle;
    }
    public double calcPerimeter(){
        double circlePerimeter = radius * Math.PI;
        return circlePerimeter;
    }
    public void display(){
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();
        String message = "Centre : (" + this.xpos + ", " + this.ypos + ")";
        System.out.println("Circle");
        System.out.println(message);
        System.out.println("Area : " + super.area);
        System.out.println("Perimeter : " + super.perimeter);
    }
}
