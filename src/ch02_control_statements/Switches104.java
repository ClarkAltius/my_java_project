package ch02_control_statements;

public class Switches104 {
    public static void main(String[] args) {
        int month = 5;
        String last_day = "30";
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                last_day = "31";
            break;
            case 4: case 6: case 9: case 11:
                last_day = "30";
                break;
            case 2:
                last_day = "28";
                break;
            default:
                last_day = "Month is in wrong format";
                System.exit(0) ; //force stop the execution upon reaching error
                break;
        }
        System.out.println("The last day of the month is : " + last_day);
    }
}
