package ch05_package_inheritance.sport;

public class Football extends Sport {
    private int halves;
    private int goals;

    public Football(String name, int entry, int halves, int goals){
        super(name, entry);
        this.halves = halves;
        this.goals = goals;
    }

    public void printInfo(){
        super.showInfo();
        System.out.println("No. of halves : " + halves);
        System.out.println("Total goals : " + goals);
    }
}
