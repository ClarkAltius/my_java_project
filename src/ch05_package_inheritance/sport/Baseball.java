package ch05_package_inheritance.sport;

public class Baseball extends Sport{
    private int innings;
    private double hitRate;

    public Baseball(String name, int entry, int innings, double hitRate){
        super(name, entry);
        this.innings = innings;
        this.hitRate = hitRate;
    }
    public void printInfo(){
        super.showInfo();
        System.out.println("Total Innings : " + innings);
        System.out.println("Total Hit Rate : " + hitRate);
    }
}
