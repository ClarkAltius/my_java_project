package ch01_variable_operator;

public class MyBox {
    public static void main(String[] args) {
        double width = 10.0 ;
        double height = 5.0 ;
        double area = width * height ;
        double perimeter = (width * 2) + (height * 2) ;
        double diagonal = Math.sqrt((width * width) + (height * height)) ; //this is... pythagoras right? width^2 + height^2 = diagonal^2, therefore root of (width^2 + height^2) = diagonal. secondary school maths... is this correct? I can't remember. let's roll with it.
        System.out.println("The diagonal line is " + diagonal);

    }
}
