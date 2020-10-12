package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание: Заполнить массив размерности n случайными цифрами
 * от –2 до n. Если в массиве есть хотя бы одно отрицательное
 * значение меньше -1, заменить все отрицательные значение
 * в массиве на квадрат (в степени 2) этих значений. Вывести
 * исходный и результирующий массив на консоль.
 * <p>
 * Пример вывода:
 *      Исходный массив [9, 10, -2, 4, 0, 5, 1, 8, -1, 3]
 *      Результат [9, 10, 4, 4, 0, 5, 1, 8, 1, 3]
 */
public class Task09 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest09
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        // TODO: Пишите код здесь
        int[] arr = new int[len];int[] arr2 = new int[len];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rnd.nextInt(len+2)-2;
        }
        for (int i = 0; i < arr.length; i++)
        { arr2[i]= arr[i];
            if(arr[i]<-1)
            {
            arr2[i] = arr[i]*arr[i];
            }
        }
        System.out.print("исходный массив [");
        for(int t=0;t<arr.length;t++)
        {
                System.out.print(arr[t]+", ");
        }
        System.out.print("]");
        System.out.println();
        System.out.print("результат [");
        for(int t=0;t<arr.length;t++)
        {
            System.out.print(arr2[t]+", ");
        }
        System.out.print("]");
    }
}
