package ch02_control_statements;

public class For107 {
    public static void main(String[] args) {
        //print the number of stars equal to the input
        //5 stars per line
        int star = 48;
        System.out.println("Print " + star + " star(s).");
        for (int i = 1; i <= star; i++) {
            System.out.print("*");
            if (i%5 == 0) {
                //System.out.println("\n"); //I'm getting a whole empty line between the 5 stars. Can I just change the line? oh println and \n does the same thing. dumb.
                System.out.println(""); //new line
                
            }
            }
        }
    }

