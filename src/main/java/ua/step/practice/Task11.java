package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание: Есть массив размером n элементов и заполненный
 * случайными числами в диапазоне от 0 до 100.
 * Необходимо разделить этот массив на массивы меньшего
 * размера в каждом из которых будет находиться не менее m элементов из
 * большого массива.
 * Значения n и m вводятся с клавиатуры пользователем.
 * Вывести на экран исходный массив и разделенный массив.
 *
 * Пример вывода:
 *
 * Исходный массив [35, 80, 39, 79, 63, 32, 89, 22, 29, 29]
 * Результат
 * [35, 80, 39]
 * [79, 63, 32]
 * [89, 22, 29]
 * [29]
 */
public class Task11 {

    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest09
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массивов через пробел: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr=new int [n]; int u=0;
        // TODO: Пишите код здесь
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rnd.nextInt(100+1)+0;
        }

        System.out.print("исходный массив [");
        for (int t = 0; t < arr.length; t++)
        {
            if(t+1==arr.length){  System.out.print(arr[t]);}else{
                System.out.print(arr[t]+", ");}
        }
        System.out.print("]");
        System.out.print("\nрезультат\n");
        for (int i = 0; i < arr.length; i+=m)
        { if(u+m>n){u+=1;}else{u+=m;}
            System.out.print("[");
            for(int t=i;t<u;t++)
            {
                if(t+1>=u){  System.out.print(arr[t]);}else{
                    System.out.print(arr[t]+", ");}
            }


            System.out.print("]");
            System.out.println();
        }

    }
}
