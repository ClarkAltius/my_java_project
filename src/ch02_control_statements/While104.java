package ch02_control_statements;
import java.util.Scanner;

public class While104 {
    public static void main(String[] args) {
        int total = 0;
        int count = 0;
        double average = 0.0;

        //Preparing Scanner. this will allow the code to receive external inputs while running.
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.print("Input Score " + (count + 1) + " : ");
            int grade = scan.nextInt();
            if (grade < -10) {
                break;
            }else{
                total += Math.abs(grade);
                count += 1;
                average = total / count;
            }
        }
        System.out.println("Exiting Calculation");
        System.out.println("No. of tests : " + count);
        System.out.println("Total Score : " + total);
        System.out.println("Average Score : " + average);
    }
}
