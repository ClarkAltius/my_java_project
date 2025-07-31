package ch03_array;

public class Array102 {
    public static void main(String[] args) {
        String[] bts = new String[7];
        bts[0] = "가";
        bts[1] = "나";
        bts[2] = "다";
        bts[3] = "라";
        bts[4] = "마";
        bts[5] = "바";
        bts[6] = "사";
        for (int i = 0; i < bts.length; i++) {
            if (i != 6) {
                System.out.printf(bts[i] + ",");
            }else{
                System.out.printf(bts[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < bts.length; i++) {
            System.out.println("Member 1 : " + bts[i]);
        }
        String[] bts2 = {"가", "나", "다", "라", "마", "바", "사"};
        for (int i = 0; i < bts2.length; i++) {
            System.out.println("ALAPH [" + i +"] : " + bts2[i] );
        }
    }
}
