package ch02_control_statements;

public class LargeTest {
    public static void main(String[] args) {
        int no1 = 100, no2 = 200 ;
        if(no1 >= no2) {
            System.out.println("the former number is greater than or equal to the latter");
            System.out.println("The bigger number : " + no1);
        } else {
            System.out.println("the former number is objectively smaller than the latter");
            System.out.println("The bigger number : " + no2);
        }
    }
}
