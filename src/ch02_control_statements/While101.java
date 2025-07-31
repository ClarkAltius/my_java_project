package ch02_control_statements;

public class While101 {
    public static void main(String[] args) {
        int total = 0;
        int i = 1; //declare variables.
        while(i < 11) { //so, while i is smaller than 11, it repeats the lines below.
            i += 1; //in this case, we add 1 to i
            total += 1; //we add 1 to total too, but this is a bit redundant in showing how while works, innit?
        }
        System.out.println(i);
        System.out.println(total);

        total = 0;
        i = 1;
        while(i <= 100) {
            total += i;
            i += 3;
        }
        System.out.println(total);

        total = 0;
        i = 97;
        while(i >= 2) {
            total += i;
            i -= 5;
        }
        System.out.println(total);

        total = 0;
        i = 1;
        while (i <= 96){
            total += i * i;
            i += 5;
        }
        System.out.println(total);

        total = 0;
        i = 1;
        while (i <= 5) {
            total += i * (i + 1) ;
            i++;
        }
        System.out.println(total);
    } //I can achieve exactly the same thing with for. why have two of the same functions?
}
