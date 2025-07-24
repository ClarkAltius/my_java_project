public class Arithmetic101 {
    public static void main(String[] args) {
        int x = 14, y = 5 ;
        System.out.println("addition : " + (x + y));
        System.out.println("subtraction : " + (x - y));
        System.out.println("multiplication : " +(x * y));
        System.out.println("division : " + (x / y));
        System.out.println("in the same line, multiplication is executed first" + "\n" +  (x + y * x));
        System.out.println("like in mathematics, we can dictate the order by adding brackets" + "\n" +  ((x + y) * x));
        System.out.println("when the data type differs, it changes into the bigger type before execution" + "\n" + (x / 5.0));
        System.out.println("get whatever is left from division" + "\n" + (x % y));




    }
}
