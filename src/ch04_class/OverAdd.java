package ch04_class;

public class OverAdd {
    // return_type name (instance variable)
    int Add(int x, int y, int z){
        int result = x + y + z;
        return result;
    }
    public void Add(int a, int b) {
        System.out.println("Addition : " + (a + b));
    }
    public void Add(double a, double b){
        System.out.println("Addition Float : " + (a + b));
    }
}
