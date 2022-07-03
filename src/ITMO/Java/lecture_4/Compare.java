package ITMO.Java.lecture_4;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {

        System.out.println("Введите первое число:");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("Введите второе число:");
        int num2 = scan.nextInt();
        System.out.println("Введите третье число:");
        int num3 = scan.nextInt();
        System.out.println("Результат: " + Res(num1, num2, num3));
    }

    public static Boolean Res(int a, int b, int c) {
        return b > a && c > b;
    }
}
