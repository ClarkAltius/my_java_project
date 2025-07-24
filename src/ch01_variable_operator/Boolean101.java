package ch01_variable_operator;

public class Boolean101 {
    public static void main(String[] args) {
        boolean x ;

        x = 4 < 5 && 3 == 6 ;
        System.out.println(x); // this should come out as false, since 3 == 6 is false, and && requires both sides to be true?

    }
}
