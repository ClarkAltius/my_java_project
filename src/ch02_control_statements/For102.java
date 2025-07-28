package ch02_control_statements;

public class For102 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <=100 ; i += 3) {
            total += i;
        }
        System.out.println("1st run : " + total);

        total = 0; //reset
        for(int i = 97; i >= 2; i -= 5) {
            total += i;
        }
        System.out.println("2nd run : " + total);

        total = 0; //reset 2
        for (int i = 1; i <= 96 ; i = i + 5) {
            total += (i * i);
        }
        System.out.println("3rd run : " + total);

        total = 0; // reset 3
        for (int i = 1; i <= 5; i++) {
            total += i * (i + 1) ;
        }
        System.out.println("4th run : " + total);
    }
}
