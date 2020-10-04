package ua.step.practice;

import java.util.Scanner;

/**
 * Задание: написать программу, которая проверяет, все ли значения
 * элементов массива различные (не повторяются). Вывести:
 * Yes – если все различные и No – если имеется хоть одно по-
 * вторение.
 * <p>
 * Размер массива задается и инициализируется в начале программы.
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();
        int[] arr = new int[len]; int h=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int t=0;t<arr.length;t++)
        {
            for(int j=t+1;j<arr.length;j++)
            {
            if(arr[t]==arr[j]) h=2;
            }

        }
        System.out.println(h==2? "No":"Yes");
        // TODO: Пишите код здесь

    }
}
