package ch04_class;

import org.w3c.dom.ls.LSOutput;

public class UnitTww3 {
    //Define the variables that make up a unit. This is, of course, a snippet of the full statblock.
    static String name; //공유 하고자 하는 변수는 static 키워드를 사용.
    boolean size; //changed from string. see reasoning below.
    String type;
    int hp_per_entity;
    int melee_attack;
    int melee_defense;
    int movement;
    int weapon_strength;



    //now time for methods. I want 1. display, that simply prints everything so that should start with void.
    void display(){
        System.out.println("Name : " + name);
        if (size){
            System.out.println("Size : Medium");
        }else{
            System.out.println("Size : Large");
        }
        System.out.println("Type : " + type);
        System.out.println("HP per entity : " + hp_per_entity);
        System.out.println("Melee Attack : " + melee_attack);
        System.out.println("Melee Defense : " + melee_defense);
        System.out.println("Movement : " + movement);
        System.out.println("Weapon Strength : " + weapon_strength);
    }
    //next, I want identify size against an input. Is it better to assign the original variable as a boolean? There are only two sizes in tww3, so bool size_medium and treat anything not medium as large. I want to return a string so it starts with String
    String identifySize (boolean size){
        String unitSize;
        if (size){
            unitSize = "Medium";
        }else{
            unitSize = "Large";
        }
        String message = name + " is " + unitSize;
        return message;
    }
}
