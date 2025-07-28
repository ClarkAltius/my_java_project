package ch02_control_statements;

public class For103 {
    public static void main(String[] args) {
        int repeat = 5;
        String message = "Howdy Buddy" ;
        System.out.println("Target No. of repetition : " + repeat);
        for (int i = 1 ; i <= repeat ; i++) {
            System.out.println(message);
        }
    }
}
