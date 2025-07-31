package ch04_class;

public class SaramMain02 {
    public static void main(String[] args) {
        System.out.println(Saram02.nationality);

        Saram02 katarin = new Saram02();
        katarin.name = "Tzarina Katarin of Kislev";
        katarin.height = 168.8;
        katarin.weight = 56.1;
        katarin.hobby = "Lore of Ice and Tempest";
        katarin.blood = "We don't have blood! We are Kislev. We have ICE!";

        Saram02 boris = new Saram02();
        boris.name = "Boris Ursus, the Red Tzar";
        boris.height = 198.8;
        boris.weight = 96.1;
        boris.hobby = "Bear Wrestling";
        boris.blood = "We don't have blood! We are Kislev. We have ICE!";

        boris.nationality = "The Bear-thodox!";
        System.out.println(Saram02.nationality);
        System.out.println(katarin.nationality);

        boris.display();
        katarin.display();

    }
}
