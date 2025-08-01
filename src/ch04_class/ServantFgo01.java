package ch04_class;
//this is a class for FGO's servant's stats.
public class ServantFgo01 {
    //I will declare a few of servant's stats. I'll keep it private because it's good practice, and that means I would have to make a method that will allow other classes interacting with this.
    private String name;
    private String servant_class;
    private String alignment;
    private String tendency;
    private String hidden_attribute;

    public ServantFgo01(String name, String servant_class, String alignment, String  tendency, String hidden_attribute){
        this.name = name;
        this.servant_class = servant_class;
        this.alignment = alignment;
        this.tendency = tendency;
        this.hidden_attribute = hidden_attribute;
    }

    public ServantFgo01(String name, String servant_class, String alignment, String tendency){
        this.name = name;
        this.servant_class = servant_class;
        this.alignment = alignment;
        this.tendency = tendency;
        this.hidden_attribute = "Star";
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Class : " + servant_class);
        System.out.print("Alignment : " + alignment + "/");
        System.out.println(tendency);
        System.out.println("Attribute : " + hidden_attribute);
    }
}
