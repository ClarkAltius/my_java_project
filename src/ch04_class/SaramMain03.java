package ch04_class;

public class SaramMain03 {
    public static void main(String[] args) {
        Saram03 grimgor = new Saram03();
        Saram03 wurzzag = new Saram03();
        grimgor.setFealty("Gork");
        grimgor.setWeight(120.3);
        grimgor.setHeight(257.3);
        grimgor.setBlood("Green");
        grimgor.setHobby("Waaaaaagh!!!");
        grimgor.setName("Grimgor Ironhide");

        wurzzag.setName("Wurzzag the Green Prophet");
        wurzzag.setFealty("Mork");
        wurzzag.setBlood("Green");
        wurzzag.setHobby("Dancing");
        wurzzag.setHeight(211.3);
        wurzzag.setWeight(98.1);

        System.out.println("Name : " + grimgor.getName());
        System.out.println("Weight : " + grimgor.getWeight());
        System.out.println("Height : " + grimgor.getHeight());
        System.out.println("Blood : " + grimgor.getBlood());
        System.out.println("Hobby : " + grimgor.getHobby());
        System.out.println("Fealty : " + grimgor.getFealty());

        System.out.println("Name : " + wurzzag.getName());
        System.out.println("Weight : " + wurzzag.getWeight());
        System.out.println("Height : " + wurzzag.getHeight());
        System.out.println("Blood : " + wurzzag.getBlood());
        System.out.println("Hobby : " + wurzzag.getHobby());
        System.out.println("Fealty : " + wurzzag.getFealty());


    }
}
