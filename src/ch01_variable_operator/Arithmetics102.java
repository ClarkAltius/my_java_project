package ch01_variable_operator;

public class Arithmetics102 {
    public static void main(String[] args) {
        int x = 5 ;
        x = x + 3;
        System.out.println("x : " + x);

        // x += 3 is identical to x = x +3
        x -= 1;
        System.out.println("x : " + x);
        x *= 2;
        System.out.println("x : " + x);
        x /= 2;
        System.out.println("x : " + x);
        x %= 2;
        System.out.println("x : " + x);
    }
}
