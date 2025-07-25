package ch01_variable_operator;

public class Casting {
    public static void main(String[] args) {
        double d = 100 ;
        int ha = (int) 12.5 ;
        System.out.println(d);
        System.out.println(ha);
        System.out.println(12/5);
        //the below two are executed differently.
        System.out.println((double) 12/5); //this turns into 12.0/5. the 5 is an integer. however, the 5 is later implicitly changed into a float too.
        System.out.println((double) (12/5)); //this turns into 12.0/5.0. both are explicitly changed into floats (or doubles...?) wrong! it calculates the brackets first, which means they are still integers AND THEN casts them into floats. So that's why the result prints 2.0 instead of 2.4. alright. consistent with execution logics.
        int kor = 50, eng = 60, math = 80 ;
        int total = 0 ;
        double average = 0 ;
        average = (kor + eng + math) / 3.0 ;
        System.out.println("total score : " + total);
        System.out.println("average score : " + average);

        char ch1 = 'c' ;
        char ch2 = 'a' ;
        boolean bool1 = ch1 > ch2 ; //implicit typecasting. 99>97, therefore true.
        System.out.println("bool1 : " + bool1);

        int result ;
        result = ch1 - ch2 + 5 ;
        System.out.println("result : " + result);
        char ch3 = 'D' ;

        String capital = ((ch3 >= 'A') && (ch3 <= 'Z')) ? "Yes" : "No" ; // characters are stored as bytes. capital letters have higher numbers, right?
        System.out.println("capital or not : " + capital);

    }
}
