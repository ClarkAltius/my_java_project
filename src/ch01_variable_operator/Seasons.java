package ch01_variable_operator;

public class Seasons {
    public static void main(String[] args) {
        int month = 4;
        String season = "Unknown" ;
        if (month >= 3 && month <= 5) {
            season = "Spring";
        }
        System.out.println(season);
    }

}
