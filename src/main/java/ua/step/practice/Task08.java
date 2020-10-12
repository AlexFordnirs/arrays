package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;


/**
 * Задание: Заполнить массив размерности n случайными строчны-
 * ми (маленькими) латинскими буквами. Подсчитать, сколько раз встреча-
 * ется каждая буква. Вывести буквы, которые встречаются
 * больше 3 раз. n – задается с клавиатуры.
 * <p>
 * Пример вывода:
 * g - 4 раза
 * l - 4 раза
 * s - 5 раз
 * v - 5 раз
 * x - 5 раз
 */
public class Task08 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest08
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        int[] arr = new int[len]; int colnam=0,ht=9;String gt=""; String arr2[][]= new String[2][arr.length];

        for(int t=0;t<arr.length;t++)
        {
            for(int j=t;j<arr.length;j++)
            {
                if(args[t]==args[j]) {colnam++; gt=args[t];}
            }
            if(colnam>=0)
            {
                for(int i=0;i<arr.length;i++)
                {
                    if(arr2[0][i]==gt) {ht++; }
                }
                if(ht==9){arr2[0][t]=gt;arr2[1][t]="colnam"; }
            }
            ht=9;
            colnam=0;
        }
        for(int t=0;t<arr.length;t++)
        {
            if(arr2[0][t]!="")
            {
                System.out.print(arr2[0][t]+" - "+arr2[1][t]+" раза\n");
            }
        }
    }
}
