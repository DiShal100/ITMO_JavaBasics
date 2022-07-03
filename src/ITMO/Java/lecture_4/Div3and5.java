package ITMO.Java.lecture_4;

import java.util.ArrayList;

public class Div3and5 {
    public static void main(String[] args) {
//    ArrayList numbers_Div_3 = new ArrayList();
//    ArrayList numbers_Div_5 = new ArrayList();
//    ArrayList numbers_Div_3and5 = new ArrayList();
//    for(int i = 1; i<=100; i++) {
//        if((i % 3) == 0 && (i % 5) == 0) {
//            numbers_Div_3and5.add(i);
//        }
//        else if((i % 3) == 0) {
//            numbers_Div_3.add(i);
//        }
//        else if((i % 5) == 0) {
//            numbers_Div_5.add(i);
//        }
//    }
//        System.out.println("Делится на 3: " + numbers_Div_3.toString());
//        System.out.println("Делится на 5: " + numbers_Div_5.toString());
//        System.out.println("Делится на 3 и на 5: " + numbers_Div_3and5.toString());

        String numbers_Div_3 = "Делится на 3: ";
        String numbers_Div_5 = "Делится на 5: ";
        String numbers_Div_3and5 = "Делится на 3 и на 5: ";

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                numbers_Div_3 += i + ", ";
            }
            if (i % 5 == 0) {
                numbers_Div_5 += i + ", ";
            }
            if ((i % 3 == 0) && (i % 5 == 0)) {
                numbers_Div_3and5 += i + ", ";
            }
        }
        System.out.println(numbers_Div_3);
        System.out.println(numbers_Div_5);
        System.out.println(numbers_Div_3and5);
    }
}
