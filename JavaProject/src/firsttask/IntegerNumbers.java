/**
 * Java. Task 1.
 *
 * Создать программу, которая будет сообщать, является ли целое число, введенное пользователем, чётным или нечётным,
 * простым или составным.  Если пользователь введёт не целое число, то сообщать ему об ошибке.
 *
 * @author Andry Krasikov
 * @version November 2, 2019
 */
package firsttask;
import java.util.Scanner;

public class IntegerNumbers {

    static int number;
    static boolean isComposite;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число:");
        try {
            number = scan.nextInt();
            if (number % 2 == 0) {
                System.out.print("Введено чётное, ");
                if (number == 0)
                    System.out.println("не натуральное число");
                if (number > 2)
                    System.out.println("составное число");
                else
                    System.out.println("простое число");
            } else {
                System.out.print("Введено нечётное, ");
                if (number == 1)
                    System.out.println("натуральное число 1");
                else {
                    for (int i = 2; i < number; i++) {
                        if (number % i == 0) {
                            isComposite = true;
                            break;
                        }
                    }
                    if (isComposite)
                        System.out.println("составное число");
                    else
                        System.out.println("простое число");
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка: введены неверные данные!");
        }
    }
}
