package ITMO.Java;

import java.util.Scanner;

public class lecture_1 {
    public static void main(String[] args) {

        String[] javaSlogan = {"Я", "хорошо", "знаю", "Java."};
        for (int i = 0; i < 4; i++) {
            System.out.println(javaSlogan[i]);
        }

        int a = 46;
        int b = 10;
        int c = 3;
        int d = 29;
        int e = 4;
        int f = -15;

        double result_1 = (a + b) * ((double) b / c);
        double result_2 = (d * e * f);
        System.out.println(result_1);
        System.out.println(result_2);

        int number = 10500;
        double result = (((double) number / 10) / 10);
        System.out.println(result);


        double x = 3.6d;
        double y = 4.1d;
        double z = 5.9d;
        double result_3 = x * y * z;
        System.out.println(result_3);


        Scanner scan = new Scanner(System.in);
        int dig1 = scan.nextInt();
        int dig2 = scan.nextInt();
        int dig3 = scan.nextInt();
        System.out.println(dig1);
        System.out.println(dig2);
        System.out.println(dig3);


        Scanner scan2 = new Scanner(System.in);
        int dig4 = scan2.nextInt();
        int dig5 = dig4 % 2;
        if (dig5 != 0) {
            System.out.println("Нечётное");
        } else if (dig5 == 0 && dig5 > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (dig5 == 0) {
            System.out.println("Чётное");
        }

    }
}

