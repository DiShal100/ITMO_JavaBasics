package ITMO.Java.lecture_4;

import java.util.Arrays;

public class Contain {
    public static void main(String[] args) {
        int[] intArray = {5, 16, 13, 3, 19, 18, 1, 33};
        Arrays.sort(intArray);
        boolean isContain = false;
        for (int i : intArray) {
            if (i == 1 || i == 3) {
                isContain = true;
                break;
            }
        }
//        if (Arrays.binarySearch(intArray, 1) > 0 || Arrays.binarySearch(intArray, 3) > 0) {
//            isContain = true;
//        }
        System.out.println("Массив 'intArray' содержит число '1' или '3'? - " + isContain);
//    }
    }
}

