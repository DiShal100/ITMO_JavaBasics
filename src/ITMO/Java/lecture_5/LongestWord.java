package ITMO.Java.lecture_5;

import java.util.Arrays;

public class LongestWord {
    public static void main(String[] args) {
        String text = "Java это отличный язык программирования программирования программирования";
        System.out.println("Самое длинное слово(а) в тексте: " + LgtWord(text));
    }

    public static String LgtWord(String text) {
        String[] textArray = text.split(" ");
        for (int i = 0; i < textArray.length - 1; i++) {
            String word1 = textArray[i];
            String word2 = textArray[i + 1];
            if (textArray[i].length() > textArray[i + 1].length()) {
                textArray[i] = word2;
                textArray[i + 1] = word1;
            }
        }
        System.out.println("Отсортированный массив 'textArray[]': " + Arrays.toString(textArray));

        String longest_word = null;
        if (textArray[textArray.length - 1].length() > textArray[textArray.length - 2].length()) {
            longest_word = String.valueOf(textArray[textArray.length - 1]);
        }
        else if (textArray[textArray.length - 1].length() == textArray[textArray.length - 2].length()) {
            longest_word = textArray[textArray.length - 1] + ", ";
            for (int i = textArray.length - 1; i > 0; i--) {
                if (textArray[i].length() == textArray[i-1].length()) {
                    longest_word +=  textArray[i - 1] + ", ";
                }
                else {
                    int start = longest_word.length() - 2;
                    StringBuilder stringBuilder = new StringBuilder(longest_word);
                    longest_word = String.valueOf(stringBuilder.replace(longest_word.length()-2, longest_word.length()-1, "."));
                    break;
                }
            }
        }
        return longest_word;
    }
}

