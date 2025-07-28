package ch02_control_statements;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice;
    do {
        System.out.println("1. Play");
        System.out.println("2. Quit");
        System.out.println("Enter Choice : ");
        choice = scanner.nextInt();
    } while (choice != 2);
        System.out.println("Bye");
        scanner.close();
    }
}
