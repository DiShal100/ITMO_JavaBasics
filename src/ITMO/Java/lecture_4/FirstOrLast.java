package ITMO.Java.lecture_4;

import java.util.Arrays;

public class FirstOrLast {
    public static void main(String[] args) {
        int[] intArray1 = {3, 11, 48, 1, 9, 18};
        int[] intArray2 = {16, 105, 22, 6, 14, 3};
        int[] intArray3 = {11, 23, 51, 74, 10, 56};

        if (intArray1.length >= 2) {
            if (intArray1[0] == 3 || intArray1[intArray1.length - 1] == 3) {
                System.out.print("Массив 'intArray1' " + Arrays.toString(intArray1) + ": ");
                System.out.println(true);
            } else System.out.println("Массив 'intArray1': " + false);
        }

        if (intArray2.length >= 2) {
            if (intArray2[0] == 3 || intArray2[intArray2.length - 1] == 3) {
                System.out.print("Массив 'intArray2' " + Arrays.toString(intArray2) + ": ");
                System.out.println(true);
            } else System.out.println("Массив 'intArray2': " + false);
        }

        if (intArray3.length >= 2)
            if (intArray3[0] == 3 || intArray3[intArray3.length - 1] == 3) {
                System.out.print("Массив 'intArray3' " + Arrays.toString(intArray3) + ": ");
                System.out.println(true);
            } else System.out.println("Массив 'intArray3': " + false);
    }
}
