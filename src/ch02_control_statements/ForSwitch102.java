package ch02_control_statements;

public class ForSwitch102 {
    public static void main(String[] args) {
        int sum0 = 0;
        int sum1 = 0;
        int sum2 = 0;
        //1 to 10. sum 0 sum of all numbers divisible by 3. sum1 sum of all numbers whose remainder is 1. sum2 is the sum of the rest.
        for (int i = 1; i <= 10 ; i++){
            switch(i%3) {
                case 0:
                    sum0 += i;
                    break;
                case 1:
                    sum1 += i;
                    break;
                default :
                    sum2 += i;
                    break;
            }
        }
        System.out.println(sum0);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
