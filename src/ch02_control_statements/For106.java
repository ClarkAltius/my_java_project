package ch02_control_statements;

public class For106 {
    public static void main(String[] args) {
        int no1 = 3;
        int no2 = 7;
        int total = 0;
        for (int i = no1; i <= no2 ; i++) {
            total += (i);
            System.out.println("i : " + i);
            System.out.println("total : " + total);
        }
        System.out.println(total);
    }
}
