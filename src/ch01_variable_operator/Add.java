package ch01_variable_operator;

public class Add {
    public static void main(String[] args) {
        int a ; //int literally means integer. this defines the variable a as an integer which I can use later.
        a = 3 ; //here I assign the declared variable a to the number 3.
        int b ;
        b = 66 ;
        int result ;

        result = 2*a + 3*b;
        System.out.print("3 times 2 plus 3 times 66 is ");
        System.out.println(result);
        String message ; //this is literally a string of characters. This is also a declaration of a variable.
        message = a + " times 2 plus 3 times " + b + " is " ;
        System.out.print(message);
        System.out.println(result);
        //same result, different approaches. but this now will reflect the changes in variables automatically.
        int x = 55 ;
        int y = 44 ;
        String new_message ;
        new_message = x + " 곱하기 " + y + " 는 " + x*y + " 입니다!";
        System.out.println(new_message);
        System.out.println("Imma f u ↑");
    }
}
