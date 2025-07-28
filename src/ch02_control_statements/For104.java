package ch02_control_statements;

public class For104 {
    public static void main(String[] args) {
        //multiplications with for loops!
        int multiplier = 3;
        int total = 1;
        System.out.println("Which multiplier table do you want : " + multiplier);
        for (int i = 1; i <= 9 ; i++) {
            total = i * multiplier;
            System.out.println(i + "*" + multiplier + "=" + total);
        }
    }
}
