package ch02_control_statements;

public class Switches101 {
    public static void main(String[] args) {
        int coffee = 5;
        String condition = "Do you even coffee?" ;
        switch (coffee) {
            case 0:
                condition = "Mild Headache from noon.";
                break;
            case 1:
                condition = "Fine, but a bit drowsy.";
                break;
            case 2:
                condition = "Just right, if the second coffee is before 1PM.";
                break;
            case 3:
                condition = "A bit restless, a little shortness of breath if I didn't sleep well last night.";
                break;
            case 4:
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
