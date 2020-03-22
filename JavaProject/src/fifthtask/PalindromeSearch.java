/**
 * Java. Task 5.
 *
 * Создать программу, которая в последовательности от 0 до N, находит все числа-палиндромы
 * (зеркальное значение равно оригинальному). Длина последовательности N вводится вручную и не должна превышать 100.
 *
 * @author Andry Krasikov
 * @version March 22, 2020
 */

package fifthtask;

import java.util.Scanner;

public class PalindromeSearch {
    static byte sequenceLength;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("С целью поиска чисел-палиндромов введите длину последовательности целых чисел от 0 до 100:");
        try {
            sequenceLength = scan.nextByte();
            if (sequenceLength>=0 && sequenceLength<=100) {
                for (int i = 0; i <= sequenceLength; i++) {
                    if (isPalindrome(i))
                        System.out.print(i + " ");
                }
            } else System.out.println("Ошибка: введено некорректное значение длины последовательности!");
        } catch (Exception e) {
            System.out.println("Ошибка: введены неверные данные!");
        }
    }

    static boolean isPalindrome(int integer) {
        int palindrome = integer;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        return integer == reverse;

    }
}
