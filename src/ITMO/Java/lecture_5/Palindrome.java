package ITMO.Java.lecture_5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Введите слово: ");
        Scanner scan = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer(scan.nextLine());
        String revers_word = String.valueOf(stringBuffer.reverse());
        System.out.println(revers_word);
        String input_word = stringBuffer.toString();
        System.out.println(input_word);
        if (input_word.equals(revers_word)) {
            System.out.println("Введённое слово, - " + '\'' + input_word + '\'' + " - палиндром!");
        }
        else {
            System.out.println("Введённое слово, - " + '\'' + input_word + '\'' + " - не палиндром!");
        }
    }
}
