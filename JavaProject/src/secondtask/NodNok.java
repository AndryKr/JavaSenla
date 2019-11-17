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
import java.util.ArrayList;

public class NodNok {

    static int number1;
    static int number2;
    static int maxDivisor;
    static int nok;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два целых числа:");
        try {
            number1 = scan.nextInt();
            number2 = scan.nextInt();

            ArrayList minDivisors1 = new ArrayList();
            ArrayList minDivisors2 = new ArrayList();
            ArrayList nokDivisors = new ArrayList();
            getMinDivisors(number1, minDivisors1);
            getMinDivisors(number2, minDivisors2);
            System.out.println(minDivisors1.toString());
            System.out.println(minDivisors2.toString());
            getNok(minDivisors1, minDivisors2, nokDivisors);
            System.out.println(nokDivisors.toString());

        } catch (Exception e) {
            System.out.println("Ошибка: введены неверные данные!");
        }
    }

    static void getNok (ArrayList minDivisors1, ArrayList minDivisors2, ArrayList nokDivisors) {
        Integer[] massDivisors1 = (Integer[]) minDivisors1.toArray(new Integer[0]);
        Integer[] massDivisors2 = (Integer[]) minDivisors1.toArray(new Integer[0]);
        if (minDivisors1.size() > minDivisors2.size()) {
            for (int i = 0, j = 0; i < massDivisors1.length; ) {
                    if (minDivisors1.get(i) == minDivisors2.get(j)) {
                        nokDivisors.add(minDivisors1.get(j));
                        i++;
                        j++;
                    } else if (massDivisors1[i] < massDivisors2[j]){
                        nokDivisors.add(minDivisors1.get(j));
                        i++;
                    } else {
                        nokDivisors.add(minDivisors2.get(j));
                        j++;
                    }
            }
        } else {
            for (int i = 0, j = 0; i < massDivisors2.length; ) {
                if (minDivisors1.get(i) == minDivisors2.get(j)) {
                    nokDivisors.add(minDivisors2.get(j));
                    i++;
                    j++;
                } else if (massDivisors2[i] < massDivisors1[j]){
                    nokDivisors.add(minDivisors2.get(j));
                    i++;
                } else {
                    nokDivisors.add(minDivisors1.get(j));
                    j++;
                }
            }
        }
    }

    static void getMinDivisors (int number, ArrayList minDivisors) {
        maxDivisor = number;
        for (int i = 2; i <= maxDivisor; i++) {
            if (maxDivisor%i == 0) {
                minDivisors.add(i);
                maxDivisor = maxDivisor/i;
                i--;
            }
        }
    }
}
