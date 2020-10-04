package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание: Заполнить массив размерности n случайными цифрами
 * от 3 до 13. Подсчитать, сколько раз встречается каждая циф-
 * ра. Вывести результат на экран. n – задается с клавиатуры
 *
 * Пример вывода:
 *      3 - 2 раза
 *      5 - 3 раза
 *      8 - 1 раза
 *      9 - 3 раза
 *      11 - 1 раза
 */
public class Task07 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest07
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();
        // TODO: Пишите код здесь
        int[] arr = new int[len]; int colnam=0;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rnd.nextInt(14)+3;
        }
        for(int t=0;t<arr.length;t++)
        {
            for(int j=t+1;j<arr.length;j++)
            {
                if(arr[t]==arr[j]) colnam++;
            }
            if(colnam>1){
                System.out.print(arr[t]+" - "+colnam+" раза\n");
            }
            colnam=0;
        }
    }
}
