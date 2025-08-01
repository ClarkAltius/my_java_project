package ch04_class;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class Saram04 {
    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    Scanner scan = null; // we declare the variable first. This will be used in multiple places

    //let's make another constructor!
    public Saram04(String name, double height, double weight, String hobby, String blood){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;
    }

    public Saram04(String name, double height, double weight, String blood){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = "Summon the Elector Counts!";
        this.blood = blood;
    }

    //public return type name
    public Saram04(){ //반환타입은 명시하지 않을 것! 매개변수의 갯수를 확인하고 적을 것. 생성자를 만들 경우 기본 생성자를 덮어쓴다. That's called overriding?
        this.name = "Siuuuuu";
        scan = new Scanner(System.in); // The scan we created outside the constructor will be initialized here. Not a concrete rule but good practice in general.
        }
    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Height : " + this.height);
        System.out.println("Weight : " + this.weight);
        System.out.println("Hobby : " + this.hobby);
        System.out.println("Blood : " + this.blood);

//        if(scan == null){
//            scan = new Scanner(System.in);
//        }
//
//        System.out.print("Enter Integer : ");
//        int no = this.scan.nextInt(); //the scan is now being used
//        System.out.println("Entered Integer : " + no);
    }
}
