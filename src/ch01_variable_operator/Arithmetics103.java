package ch01_variable_operator;

public class Arithmetics103 {
    public static void main(String[] args) {
        int a = 10, b = 20, c;
        c = ++a + b++;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        // I need explanation on the order of execution. My intuition says everything to the right of = should be executed first, but the result says otherwise. why?
        //got it. it comes from c++ philosophy, and executes left to right. so b is stored for calculation, and ++ is executed immediately afterwards.

        int x = 10;
        int y = 20;
        int z;
        z = ++x + y--;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        //let's keep going. variables are updated top to bottom, left to right.
        z += --x + y++ ;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
