package ch02_control_statements;

public class Conditionals104 {
    public static void main(String[] args) {
        int month = 3 ;
        String season ; // we assume the following. 12, 1, 2 winter, 3, 4, 5 spring, 6, 7, 8 summer, 9, 10, 11 autumn
        //goal is to print season for month input
        if (month > 12 || month < 0) {
            season = "Invalid month" ;
        } else {
            if(month >= 3 && month < 6) {
                season = "spring" ;
            } else if(month >= 6 && month < 9) {
                season = "summer" ;
            } else if(month >= 9 && month < 12) {
                season = "autumn" ;
            } else {
                season = "winter" ;
            }
            System.out.println("The month number " + month + " is " + season);

        }

    }
}
