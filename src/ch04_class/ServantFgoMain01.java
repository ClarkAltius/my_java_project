package ch04_class;

public class ServantFgoMain01 {
    public static void main(String[] args) {
        ServantFgo01 archer_emiya = new ServantFgo01("Emiya", "Archer", "Good", "neutral","Man");
        archer_emiya.display();
        System.out.println("________");

        ServantFgo01[] servant = new ServantFgo01[3];
        servant[0] = new ServantFgo01("Artoria Pendragon", "Saber", "Good", "Lawful", "Earth");
        servant[1] = new ServantFgo01("Cu Cuhlain", "Lancer", "Good", "Neutral", "Earth");
        servant[2] = new ServantFgo01("Jeanne d'Arc", "Ruler", "Good","Lawful");
        for (int i = 0; i < 3; i++) {
            servant[i].display();
            System.out.println("________");
        }

    }


}
