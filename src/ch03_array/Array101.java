package ch03_array;

public class Array101 {
    public static void main(String[] args) {
        int[] score = new int[25];
        int x = 3;
        int y = 5;

        int[] arr = new int[3];
        arr[0] = x - y + 6 ;
        arr[1] = 8;
        arr[2] = x * x * y ;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        int[] arr2 = {50, 22, 33};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }

    }
}
