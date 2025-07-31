package ch04_class;

import org.w3c.dom.ls.LSOutput;

public class UnitTww3 {
    //Define the variables that make up a unit. This is, of course, a snippet of the full statblock.
    private String name; //공유 하고자 하는 변수는 static 키워드를 사용.
    private boolean size; //changed from string. see reasoning below.
    private String type;
    private int hp_per_entity;
    private int melee_attack;
    private int melee_defense;
    private int movement;
    private int weapon_strength;

//    I need to create getters and setters now. I'll make one for name manually, and the rest automatically.
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public boolean isSize() {
        return size;
    }

    public void setSize(boolean size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHp_per_entity() {
        return hp_per_entity;
    }

    public void setHp_per_entity(int hp_per_entity) {
        this.hp_per_entity = hp_per_entity;
    }

    public int getMelee_attack() {
        return melee_attack;
    }

    public void setMelee_attack(int melee_attack) {
        this.melee_attack = melee_attack;
    }

    public int getMelee_defense() {
        return melee_defense;
    }

    public void setMelee_defense(int melee_defense) {
        this.melee_defense = melee_defense;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public int getWeapon_strength() {
        return weapon_strength;
    }

    public void setWeapon_strength(int weapon_strength) {
        this.weapon_strength = weapon_strength;
    }

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
