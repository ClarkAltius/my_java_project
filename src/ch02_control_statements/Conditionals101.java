package ch02_control_statements;

public class Conditionals101 {
    public static void main(String[] args) {
        int no = 10;
        if (no%1 == 0)
        System.out.println(no + " iz a propa integer Boss!");
        if (no%2 == 0) {
            System.out.println("DA numba iz even! Don't believe me? 'ave a look! : " + no);
            System.out.println("Wot even iz even Boss?");
        } else {
            System.out.println("Da numba ain't even! Don't believe me? 'ave a look! : "+ no);
            System.out.println("Wot's the opposite of even Boss?");
        }
    }
}
