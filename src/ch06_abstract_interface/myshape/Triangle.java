package ch06_abstract_interface.myshape;

public class Triangle extends Shape {
    private double width;
    private double height;
    public Triangle(String lineColour, String fillColour, double width, double height){
        super(lineColour, fillColour);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        double areaTriangle = this.height * this.width * 0.5;
        return areaTriangle;
    }
    public double calcPerimeter(){
        double trianglePerimeter = width + height + Math.sqrt(width*width + height*height) ;
        return trianglePerimeter;
    }
    public void display(){
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();
        System.out.println("Triangle");
        System.out.println("Area : " + super.area);
        System.out.println("Perimeter : " + super.perimeter);
    }
}
