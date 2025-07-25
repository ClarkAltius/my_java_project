package ch02_control_statements;

public class Conditionals102 {
    public static void main(String[] args) {
        int no = 5 ;
        if(no%3 == 0) {
            System.out.println(no + " iz a multiple of 3, Boss!");
            no *= no ;
            System.out.println(no);
        }else{
            System.out.println(no + " ain't a multiple of 3, Boss!");
            no *= 5 ;
            System.out.println(no);
        }
    }
}
