package ch04_class;

public class SaramMain05 {
    public static void main(String[] args) {
        //타입[] 배열명 = new 타입[요소갯수];

        Saram05[] saram = new Saram05[2]; //square brackets mean types.
        saram[0] = new Saram05("Karl Franz", 198.5, 88.5, "Summoning the Elector Counts", "Sigmar!"); //the parentheses mean Saram05 is a constructor
        saram[1] = new Saram05("Elspeth Von Draken", 166.5, 54, "Purple"); //the parentheses mean Saram05 is a constructor
        for (int i = 0; i < saram.length; i++){
            saram[i].display();
        }

        Saram05[] myarr = {
                new Saram05("Gorbad", 198.5, 88.5, "Da Plan", "Waaaaagh!!"),
        new Saram05("Alberic de Bordeleaux", 186.5, 84, "Grail-Golden")
        };
        for (int i = 0; i < myarr.length; i++){
            myarr[i].display();
        }
    }
}
