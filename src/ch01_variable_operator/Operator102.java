package ch01_variable_operator;

public class Operator102 {
    public static void main(String[] args) {
        int leadership_wavering_threshold = 30 ;
        int fear = -8 ;
        int flanked = -8 ;
        int losing = -8 ;
        int damaged = -15 ;
        double damaged_threshold = 0.5 ;

        String attribute = "Unbreakable" ;

        //the unit in concern
        //name is Men-at-Arms (spear)
        System.out.println("Unit : Men-at-Arms (Spear)");
        int leadership = 58 ;
        attribute = "breakable" ;
        double current_leadership = leadership + fear + flanked + losing + damaged ;

        if ((current_leadership <= leadership_wavering_threshold) && (attribute != "Unbreakable")) {
            System.out.println("Leadership Broken!");
        } else {
            System.out.println("Still Fighting!");
        }
    }
}
