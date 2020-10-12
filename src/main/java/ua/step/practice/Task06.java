package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;

/**
 * Задание: Заполнить массив на 10 элементов случайными числами
 * от -5 до +5. Посчитать количество уникальных значений
 * (встречающихся в массиве один раз). Вывести на консоль
 * значения уникальных элементов и индексы, под которыми
 * они находятся в массиве.
 *
 *  Пример:
 *      -5 -> 0 индекс
 *      3 -> 1 индекс
 *      4 -> 2 индекс
 *      2 -> 3 индекс
 *      0 -> 4 индекс
 *      -2 -> 5 индекс
 *      -4 -> 6 индекс
 *      -1 -> 9 индекс
 */
public class Task06 {

    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest06
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);


        int[] arr = new int[10];
        int colnam = 0, gt = 0, ht = 9;
        int arr2[][] = new int[2][arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(6 + 5) - 5;
            arr2[0][i] = 9;
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int t=0;t<arr.length;t++)
            {
                if(arr[i]==arr[t])
                {
                    arr2[0][t]=arr[i];arr2[1][t]+=1;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr2[1][i]==1)
            {
                System.out.print(arr2[0][i]+" -> "+i +" индекс\n");
            }
        }
    }
}
