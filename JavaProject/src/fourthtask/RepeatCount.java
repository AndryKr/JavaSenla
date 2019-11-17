/**
 * Java. Task 4.
 *
 * Создать программу, которая подсчитывает сколько раз употребляется слово в тексте (без учета регистра).
 * Текст и слово вводится вручную.
 *
 * @author Andry Krasikov
 * @version November 15, 2019
 */

package fourthtask;

import java.util.Scanner;

public class RepeatCount {
    static String text;
    static String searchWord;
    static String[] wordsArray;
    static int counter = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст:");
        try {
            text = scan.nextLine();
            System.out.println("Введите искомое слово:");
            searchWord = scan.nextLine();
            text = text.replaceAll("[^a-zA-Zа-яА-Я]", " ");
            wordsArray = text.split("\\s+");
            for (int i = 0; i < wordsArray.length; i++) {
                if (wordsArray[i].equalsIgnoreCase(searchWord))
                counter++;
            }
            System.out.println("Количество найденых слов: " + counter);
        } catch (Exception e) {
            System.out.println("Ошибка: введены неверные данные!");
        }
    }
}
