package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание: Заполнить массив размерности n случайными циф-
 * рами от 0 до 33. Найти элемент массива, который делится
 * без остатка на значение элемента слева и значение элемен-
 * та справа. Вывести на консоль значения исходного массива.
 * Вывести индекс найденного элемента, если такой не найден,
 * вывести -1. n – задается с клавиатуры.
 * <p>
 * Пример вывода:
 *      Исходный массив [31, 0, 30, 3, 23, 1, 20, 29, 16, 2, 13, 9, 18, 9, 2]
 *      Индекс элемента 12
 */
public class Task10 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest10
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();
        // TODO: Пишите код здесь
        int[] arr = new int[len]; int ar=0,r=0,s=0,w=0;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rnd.nextInt(33+1)+0;
        }
        for (int i = 0; i < arr.length; i++)
        {
            if(i!=0&&i<arr.length-1)
            {
                if(arr[i-1]!=0&&arr[i]!=0&&arr[i+1]!=0)
                { r=arr[i]; s=arr[i+1]; w=arr[i-1];
                    if (r % s == 0 && r % w == 0)
                    {
                        ar++;
                        System.out.print("исходный массив [");
                        for (int t = 0; t < arr.length; t++)
                        {
                            if(t+1==arr.length){  System.out.print(arr[t]);}else{
                                System.out.print(arr[t]+", ");}
                        }
                        System.out.print("]");
                        System.out.println("\nИндекс элемента " + i);
                    }
                }
            }
        }
     if(ar==0) {
         System.out.print("исходный массив [");
         for(int t=0;t<arr.length;t++)
         {
             if(t+1==arr.length){  System.out.print(arr[t]);}else{
             System.out.print(arr[t]+", ");}
         }
         System.out.print("]");
         System.out.println("\nиндекс элемента -1");
     }

    }
}
