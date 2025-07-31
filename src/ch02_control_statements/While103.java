package ch02_control_statements;

public class While103 {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int i = 1;
        while(i <= 10) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
            i++;
        }
        System.out.println("Odd Sum : " +odd);
        System.out.println("Even Sum : " +even);
    }
}
