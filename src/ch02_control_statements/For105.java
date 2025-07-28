package ch02_control_statements;

public class For105 {
    public static void main(String[] args) {
        int value = 0;
        int total = 0;
        System.out.println("Value Input : " + value);
        for (int i = 1; i <= 7 ; i++) {
            value = (i * i);
            System.out.println("The Square of " + i + " is : " + value);
        }
    }
}
