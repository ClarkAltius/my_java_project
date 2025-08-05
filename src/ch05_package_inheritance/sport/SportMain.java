package ch05_package_inheritance.sport;

public class SportMain {
    public static void main(String[] args) {
        Football football = new Football("Football", 11, 2, 5);
        football.printInfo();

        Baseball baseball = new Baseball("Baseball", 9, 9, 0.9);
        baseball.printInfo();
    }
}
