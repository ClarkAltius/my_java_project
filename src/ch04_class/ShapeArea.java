package ch04_class;

public class ShapeArea {
    final double PI = 3.141593;
    //I need three methods. Area for circle, square and trapeze. Use the same method name and overload them to do different things.
    double area(double a){ //method for circle
        double result = (a * a) * PI;
        return result;
    }
    double area(double a, double b){ //method for rectangles
        double result = a * b;
        return result;
    }
    double area(double a, double b, double c){ //method for trapeze
        double result = (a + b) * (c / 2);
        return result;
    }
}
