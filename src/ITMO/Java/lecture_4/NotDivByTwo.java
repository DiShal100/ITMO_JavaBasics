package ITMO.Java.lecture_4;

public class NotDivByTwo {
    public static void main(String[] args) {
        for (int i = 0; i > -100; i--) {
            if ((i % 2) != 0) {
                System.out.println("Нечётное число - " + i);
            }
        }
    }
}
