package ch04_class;

public class Saram03 {
    //Static variable, for other classes to use. Static variable = class variable = 정적 변수
    static String nationality = "Gork Morkalos";
    //instance variables, for this class only
    private String name;
    private String fealty;

    public void setFealty(String fealty){
        this.fealty = fealty;
    }

    public String getFealty(){
        return fealty;
    }

    private double height;

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    private double weight;
    private String hobby;
    private String blood;

    public static String getNationality() {
        return nationality;
    }

    public static void setNationality(String nationality) {
        Saram03.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
