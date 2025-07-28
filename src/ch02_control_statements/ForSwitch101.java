package ch02_control_statements;

public class ForSwitch101 {
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;
        int i_check = 0;
        for (int i = 1; i <= 10; i++) {
            i_check = i % 2;
            switch(i_check) {
                case 0:
                    even += i;
                break;
                case 1:
                    odd += i;
                break;
            }
        }
        System.out.println(odd);
        System.out.println(even);
    }
}
