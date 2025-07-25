package ch02_control_statements;

public class MultiCond102 {
    public static void main(String[] args) {
        int age = -18 ;
        String age_zone = "" ;
        double final_price = 0.0 ;
        //below 8 infant, below 14 child, below 20 teen, above 65 elder, otherwise adult.
        double ticket = 39.99 ;
        double discount ; //infant 100%, child 50%, teen 30%, elder 40%
        //desired output -> Age : nn \nage_zone : blahblah \ndiscount_rate : nn% \ntotal_price

        if (age >= 65) { //elder discount
            discount = 0.4 ;
            age_zone = "Elder" ;
        } else if (age >= 20 && age < 65) { //adult full price
            discount = 0 ;
            age_zone = "Adult" ;
        } else if (age >= 14 && age < 20) { //teen discount
            discount = 0.3 ;
            age_zone = "Teen" ;
        } else if (age >= 8 && age < 14) { //child discount
            discount = 0.5 ;
            age_zone = "Child" ;
        } else {
            discount = 1.0;
            age_zone = "Infant" ;
        }
        final_price = ticket * discount ;

        System.out.println("Age : " + age);
        System.out.println("Age Zone : " + age_zone);
        System.out.println("Discount Rate : " + (int) (discount * 100) + "%");
        System.out.println("Final Ticket Price : " + final_price);
    }
}
