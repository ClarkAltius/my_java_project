package ch04_class;

public class SaramMain04 {
    public static void main(String[] args) {
        Saram04 soo = new Saram04(); //Soozan
        soo.display();

        Saram04 tom = new Saram04("Tom Riddle", 188.8, 65.3, "Quilting", "B"); //Tom
        tom.display();

        //입력하지 않은 취미의 기본값은 Summon the Elector Counts!으로 설정. 그럼 변환매게가 4개인 메소드를 만들어서 오버로딩을 해줘야겠지?
        Saram04 karl = new Saram04("Karl Franz", 198.8, 65.3, "B"); //Tom
        karl.display();


    }
}
