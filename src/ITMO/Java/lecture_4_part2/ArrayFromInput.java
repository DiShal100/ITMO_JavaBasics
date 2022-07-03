package ITMO.Java.lecture_4_part2;

import java.util.*;

public class ArrayFromInput {
    public static void main(String[] args) {
        System.out.println("Введите длину массива: ");
        Scanner scan = new Scanner(System.in);
        int array_length = scan.nextInt();
        System.out.println("Введите значения для элементов массива: ");
        int[] arrayResult = new int[array_length];
        for (int i = 0; i < array_length; i++) { // как реализовать через 'for each' ?
            arrayResult[i] = scan.nextInt();
        }
//        for (int i : arrayResult) {
//            arrayResult[i] = scan.nextInt();
//        }

//Задание 4, часть 2, задача 1
        System.out.println("Массив отсортирован по возрастанию? - " + (isSorted(arrayResult) == true ? "ОК" : "Please, try again..."));
//Задание 4, часть 2, задача 2
        System.out.println("Результирующий массив 'arrayResult': " + Arrays.toString(arrayResult));
//Задание 4, часть 2, задача 3
        System.out.println("Поменять местами первый и последний элементы массива: " + Arrays.toString(swap(arrayResult)));
//Задание 4, часть 2, задача 4
        System.out.println("Первое уникальное число в массиве: " + uniqueNumber(arrayResult));
    }


    //Задание 4, часть 2, задача 1
    //Проверка сортировки массива по возрастанию
    public static Boolean isSorted(int[] array) {
        Boolean sorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }

    //Задание 4, часть 2, задача 3
    //Поменять местами первый и последний элементы массива
    public static int[] swap(int[] array1) {
        int[] array2 = array1;
        int item1 = array1[0];
        int item2 = array1[array1.length - 1];
        array2[0] = item2;
        array2[array2.length - 1] = item1;
        return array2;
    }

    //Задание 4, часть 2, задача 4
    //Поиск первого уникального числа в массиве
    public static int uniqueNumber(int[] array) {
        int[] resultArray = new int[array.length];
        resultArray = array;

        for (int i = resultArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (resultArray[j] > resultArray[j + 1]) {
                    int tmp_item = resultArray[j];
                    resultArray[j] = resultArray[j + 1];
                    resultArray[j + 1] = tmp_item;
                }
            }
        }

        System.out.println(Arrays.toString(resultArray));

        int unique_num = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (resultArray[i] == resultArray[i + 1]) {
            } else {
                unique_num = resultArray[i + 1];
            }
        }
        return unique_num;
    }
}

