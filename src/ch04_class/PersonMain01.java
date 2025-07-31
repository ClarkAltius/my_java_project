package ch04_class;

public class PersonMain01 {
    public static void main(String[] args) {
        //Step 2: creating object
        //class_name object_name = new constructor_name();
        Person01 elspeth = new Person01();
        Person01 gelt;
        gelt = new Person01();
        //Step 3: writing into object's member variable(?. The terminology is weird)
        elspeth.nationality = "Empire of Men";
        elspeth.name = "Elspeth Von Draken";
        elspeth.height = 178.8;
        elspeth.weight = 63.1;
        elspeth.hobby = "Lore of Shyish";
        elspeth.blood = "Unknown";


        gelt.nationality = "Empire of Men";
        gelt.name = "Balthazar Gelt";
        gelt.height = 188.2;
        gelt.weight = 83.1;
        gelt.hobby = "Lore of Gish";
        gelt.blood = "Unknown";

        //Step 4: print the variable
        System.out.println("Nationality : " + elspeth.nationality);
        System.out.println("Name : " + elspeth.name);
        System.out.println("Height : " + elspeth.height);

        System.out.println(elspeth.showGenderInfo(2));
        String message = gelt.showGenderInfo(3);
        System.out.println(message);

        message = elspeth.showBmiInfo();
        System.out.println(message);
        message = gelt.showBmiInfo();
        System.out.println(message);

        elspeth.display();
        gelt.display();

    }
}
