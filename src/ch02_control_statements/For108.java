package ch02_control_statements;

public class For108 {
    public static void main(String[] args) {
        //get sum for odd numbers and even numbers from the range of 1 to 10
        int odd_total = 0;
        int even_total = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                even_total += i;
            } else {
                odd_total += i;
            }
        }
        System.out.println("The odd total : " + odd_total);
        System.out.println("The even total : " + even_total);
    }
}
