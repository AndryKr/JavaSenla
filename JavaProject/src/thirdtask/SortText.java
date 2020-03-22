/**
 * Java. Task 3.
 *
 * Создать программу, которая будет:
 * - подсчитывать количество слов в предложении
 * - выводить их в отсортированном виде
 * - делать первую букву каждого слова заглавной.
 * - Предложение вводится вручную. (Разделитель пробел (“ ”)).
 *
 * @author Andry Krasikov
 * @version March 21, 2020
 */

package thirdtask;

import java.util.Arrays;
import java.util.Scanner;

public class SortText {
    static String text;
    static String[] wordsArray;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите предложение:");
        try {
            text = scan.nextLine();
            text = text.replaceAll("[^a-zA-Zа-яА-Я]", " ");
            wordsArray = text.split("\\s+");
            System.out.println("Количество слов: " + wordsArray.length);
            Arrays.sort(wordsArray);
            for (int i = 0; i < wordsArray.length; i++) {
                wordsArray[i] = wordsArray[i].substring(0, 1).toUpperCase() + wordsArray[i].substring(1);
            }
            System.out.println(Arrays.toString(wordsArray));
        } catch (Exception e) {
            System.out.println("Ошибка: введены неверные данные!");
        }
    }
}