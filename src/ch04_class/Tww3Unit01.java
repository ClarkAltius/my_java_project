package ch04_class;

public class Tww3Unit01 {
    public static void main(String[] args) {
        UnitTww3 EmpSwordsmen = new UnitTww3();
//        EmpSwordsmen.name = "Empire Swordsmen";
//        EmpSwordsmen.size = true;
//        EmpSwordsmen.type = "Infantry";
//        EmpSwordsmen.movement = 39;
//        EmpSwordsmen.hp_per_entity = 21;
//        EmpSwordsmen.melee_attack = 21;
//        EmpSwordsmen.melee_defense = 18;
//        EmpSwordsmen.weapon_strength = 17;
        //since I've changed every class variable into a private one, the above no longer works.

        EmpSwordsmen.setName("Empire Swordsmen");
        EmpSwordsmen.setSize(true);
        EmpSwordsmen.setType("Infantry");
        EmpSwordsmen.setHp_per_entity(77);
        EmpSwordsmen.setMelee_attack(21);
        EmpSwordsmen.setMelee_defense(20);
        EmpSwordsmen.setMovement(31);
        EmpSwordsmen.setWeapon_strength(29);

        System.out.println("Direct Print " + EmpSwordsmen.getName());
        System.out.println("Direct Print " + EmpSwordsmen.isSize());
        System.out.println("Direct Print " + EmpSwordsmen.getType());
        System.out.println("Direct Print " + EmpSwordsmen.getHp_per_entity());
        System.out.println("Direct Print " + EmpSwordsmen.getMelee_attack());
        System.out.println("Direct Print " + EmpSwordsmen.getMelee_defense());
        System.out.println("Direct Print " + EmpSwordsmen.getMovement());


        EmpSwordsmen.display();
        System.out.println(EmpSwordsmen.identifySize(true));


        UnitTww3 PeasantMob = new UnitTww3();

    }

}
