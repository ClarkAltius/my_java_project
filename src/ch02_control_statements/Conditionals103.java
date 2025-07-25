package ch02_control_statements;

public class Conditionals103 {
    public static void main(String[] args) {
        int score = 75 ;
        String grade = "" ;
        //A90+ B80+ C70+ D60+ F50 or below

        if(score >= 90) {
            grade = "A" ;
        } else if(score >= 80 && score < 90 ) {
            grade = "B" ;
        } else if(score >= 70) {
            grade = "C" ;
        } else if(score >= 60) {
            grade = "D" ;
        } else {
            grade = "F";
        }
        System.out.println("Grade is : " + grade);
    }
}
