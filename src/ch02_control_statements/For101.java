package ch02_control_statements;

public class For101 {
    public static void main(String[] args) {
        //let's study loopedy hoops!
        int total = 0;

        for(int i = 1; i <= 10 ; i++) {
            total += i ;
        }

        System.out.println("The Total Sum is : " + total);
        //in this case, the first i = 1, the second is 3, the third is 6 and so on, right?
    }
}
