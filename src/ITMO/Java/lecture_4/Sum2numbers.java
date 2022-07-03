package ITMO.Java.lecture_4;

import java.util.Scanner;

public class Sum2numbers {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        System.out.println("Введите первое число:");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        System.out.println("Введите второе число:");
        num2 = scan.nextInt();
        System.out.println("Введите третье число:");
        num3 = scan.nextInt();
        System.out.println("Результат: " + Res(num1, num2, num3));
    }

    public static Boolean Res(int a, int b, int c) {
        return (a+b) == c;
    }
}
