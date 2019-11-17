/**
 * Java. Task 2.
 *
 * Создать программу, которая будет вычислять и выводить на экран НОК (наименьшее общее кратное) и НОД
 * (наибольший общий делитель) двух целых чисел, введенных пользователем.
 * Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 *
 * @author Andry Krasikov
 * @version November 2, 2019
 */
package secondtask;
import java.util.Scanner;

public class NokNod {

    static int number1;
    static int number2;
    static int nod;
    static int nok;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два целых числа:");
        try {
            number1 = scan.nextInt();
            number2 = scan.nextInt();
            getNod (number1, number2);
            getNok (number1, number2);
        } catch (Exception e) {
            System.out.println("Ошибка: введены неверные данные!");
        }
    }

    static void getNok (int number1, int number2) {
        nok = number1*number2/nod;
        System.out.println("Наименьшее общее кратное: " + nok);
    }

    static void getNod (int number1, int number2) {
        for (int i = number1, j = number2;;) {
            if (i > j) i = i - j;
            if (i < j) j = j - i;
            if (i == j) {
                nod = i;
                break;
            }
        }
        System.out.println("Наибольший общий делитель: " + nod);
    }
}
