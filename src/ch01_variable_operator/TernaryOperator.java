package ch01_variable_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 4, b = 5, c, result ;
        String comment ;
        c = a % 2;
        System.out.println(c);
        result = (c == 0) ? a + 3 : a * a ;
        comment = (c == 0) ? "짝수입니다 " : "홀수입니다 " ;
        System.out.println("결과는 " + comment + result);

        int x = 5 ;
        int y = 12 ;

        comment = ((y % x == 0)) ? "x is y's divisor" : "x is not y's divisor" ;
        System.out.println(comment);

        int su = 7 ;
        // no.7 is an odd number
        int score = 85 ;
        // 60 or greater is a pass

        String numtype ;
        numtype = ((su & 2) != 0) ? " is an odd number." : " is not an odd number." ;
        System.out.println("No." + su + numtype);
        String passornot ;
        passornot = (score >= 60) ? ", you have passed." : ", you did not pass." ;
        System.out.println("with the score of " + score + passornot);




    }
}
