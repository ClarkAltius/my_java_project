package ch02_control_statements;

public class While102 {
    public static void main(String[] args) {
        int multiple = 3;
        int i = 1;
        int output = 0;
        System.out.println("print for the multiplier : " + multiple);
        while(i <= 9){
            output = multiple * i;
            i++;
            System.out.println(i + "*" + multiple + " = " + output);
        }
    }
}
