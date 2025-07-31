package ch04_class;

public class Tww3Unit01 {
    public static void main(String[] args) {
        UnitTww3 EmpSwordsmen = new UnitTww3();
        EmpSwordsmen.name = "Empire Swordsmen";
        EmpSwordsmen.size = true;
        EmpSwordsmen.type = "Infantry";
        EmpSwordsmen.movement = 39;
        EmpSwordsmen.hp_per_entity = 21;
        EmpSwordsmen.melee_attack = 21;
        EmpSwordsmen.melee_defense = 18;
        EmpSwordsmen.weapon_strength = 17;

        EmpSwordsmen.display();
        System.out.println(EmpSwordsmen.identifySize(true));

        UnitTww3 PeasantMob = new UnitTww3();

    }

}
