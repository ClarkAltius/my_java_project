package ch01_variable_operator;

public class ShowScore {
    public static void main(String[] args) {
        String name = "Mashu" ;
        double literature = 40.0 ;
        double english_as_foreign_language = 43.0 ;
        double average_score = (literature + english_as_foreign_language) / 2 ;
        System.out.println("Name : " + name);
        System.out.println("Lit : " + literature);
        System.out.println("Eng : " + english_as_foreign_language);
        System.out.println("AVG : " + average_score);


    }
}
