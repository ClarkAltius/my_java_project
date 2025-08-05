package ch05_package_inheritance.sport;

public class Sport {
    private String name;
    private int entry;

    public Sport(String name, int entry){
        this.name = name;
        this.entry = entry;
    }

    public void showInfo(){
        System.out.print("The game " + name + " is composed of ");
        System.out.println(entry + " players.");
    }
}
