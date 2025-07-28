package ch02_control_statements;

public class Switches103 {
    public static void main(String[] args) {
        int month = 9;
        String season = "Hot and Cold?";
        switch(month) {
            case 3: case 4: case 5:
                season = "Flowers bloom and yer still single";
                break;
            case 6: case 7: case 8:
                season = "Turn you into Roast Pork";
                break;
            case 9: case 10: case 11:
                season = "The leaves fall and so does your spirit";
                break;
            case 12: case 1: case 2:
                season = "The air grows cold, and so do the people";
                break;
            default :
                season = "Do you even season bro?";
                break;

        }
        System.out.println(season);
    }
}
