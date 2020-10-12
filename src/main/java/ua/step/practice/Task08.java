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
 int L=97,R=122; int targetStringLength = 1;
        char[] arr = new char[len]; int colnam=0,ht=9;String gt=""; char arr2[][]= new char[2][arr.length];

        for(int i=0;i<arr.length;i++)
        {char random_3_Char = (char) (97 + rnd.nextInt(26));
            arr[i] =random_3_Char;arr2[0][i]='⌂';
        }

        for(int t=0;t<arr.length;t++)
        {
            for(int j=t;j<arr.length;j++)
            {
                if(arr[t]==arr[j]) {colnam++;}
            }
            if(colnam>=4)
            {
                arr2[0][t]=arr[t];arr2[1][t]+=colnam;
            }
            colnam=0;
        }
        for(int t=0;t<arr.length;t++)
        {
            if(arr2[0][t]!='⌂')
            {
                System.out.print(arr2[0][t]+" - "+arr2[1][t]+" раза\n");
            }
        }
    }
}
