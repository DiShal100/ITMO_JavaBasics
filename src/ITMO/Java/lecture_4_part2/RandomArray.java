package ITMO.Java.lecture_4_part2;

import java.util.Arrays;

//Задание 4, часть 2, задача 5
public class RandomArray {
    public static void main(String[] args) {
        int[] randArray = new int[10];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = (int) (Math.random() * 100);
        }
        System.out.println("Рандомный массив: " + Arrays.toString(randArray));

        //Пузырьковая сортировка массива
        for (int i = randArray.length-1; i > 0 ; i--) {
            for (int j = 0 ; j < i ; j++) {
                if (randArray[j] > randArray[j+1]) {
                    int tmp_item = randArray[j];
                    randArray[j] = randArray[j+1];
                    randArray[j+1] = tmp_item;
                }
            }
        }
        System.out.println("Отсортированный рандомный массив: " + Arrays.toString(randArray));
    }
}
