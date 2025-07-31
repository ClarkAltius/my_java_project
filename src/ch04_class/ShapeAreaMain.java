package ch04_class;

import java.awt.*;

public class ShapeAreaMain {
    public static void main(String[] args) {
        int radius = 10;
        int square_height = 5;
        int square_width = 10;
        int triangle_height = 5;
        int triangle_width = 10;
        int trapeze_height = 10;
        int trapeze_top_width = 5;
        int trapeze_base = 15;
        ShapeArea obj = new ShapeArea();

        double result = obj.area(radius);
        System.out.println("Area of the Circle : " + result);

        result = obj.area(square_height, square_width);
        System.out.println("Area of the Square : " + result);

        result = obj.area(trapeze_base, trapeze_top_width, trapeze_height);
        System.out.println("Area of the Trapeze : " + result);

        result = obj.area(triangle_height, triangle_width);
        System.out.println("Area of the Triangle : " + result);

    }
}
