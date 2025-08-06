package ch06_abstract_interface.myshape;

public class ShapeMain {
    public static void main(String[] args) {

        //Anonymous Inner Type enables an instantiation of an abstract class object by forcing to fill out the specifics of the incomplete methods.

        Shape sample01 = new Shape("Black","red"){
            @Override
            public double calcArea(){
                System.out.println("haha");
                return 0;
            }

            @Override
            public double calcPerimeter() {
                return 0;
            }

            @Override
            public void display() {

            }
        };

        sample01.display();

        Shape[] shape ={
          new Circle("Green", "White", 10.0, 3.3, 4.4),
          new Rectangle("Red", "Blue", 10.0, 15.0),
          new Triangle("Yellow", "Black", 15.0, 10.0)
        };
        for (int i = 0; i < shape.length; i++) {
            shape[i].display();
            shape[i].draw();
            System.out.println("_____________");
        }
        System.out.println("================");
        //this can't be instantiated, because shape is an abstract class. Abstract class is only there to enable instantiation of their subclasses.
//        Shape myshape = new Shape();
    }
}
