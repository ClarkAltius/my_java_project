package ch02_control_statements;

public class Switches102 {
    public static void main(String[] args) {
        int coffee = 5;
        String condition = "Do you even coffee?" ;
        switch (coffee) {
            case 0: case 1: case 2:  //case 0, 1, 2: also works. huh... was this always possible?
                condition = "Just right, if the second coffee is before 1PM.";
                break;
            case 3: case 4:
                condition = "The heartbeat becomes noticeably faster. Not quite 'oh no' yet.";
                break;
            case 5:
                condition = "I can hear my heartbeat in my ears. This is normal right?";
                break;
            default:
                condition = "I stopped counting. Sleep is for the weak.";
                break;
        }
        System.out.println(condition);
    }
}
