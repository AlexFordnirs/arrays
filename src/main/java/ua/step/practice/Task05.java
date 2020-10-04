package ua.step.practice;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;

/**
 * Задание: Заполнить массив на 10 элементов случайными числами
 * от -5 до +5. Посчитать количество повторяющихся значений.
 * Вывести на консоль только повторяющиеся элементы (больше одного повторения)
 * и количество повторений.
 * <p>
 * Пример:
 * 0 – 5 раз
 * 2 – 3 раза
 * 7 – 2 раза
 */
public class Task05 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest05
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        // TODO: Пишите код здесь

        int[] arr = new int[10]; int colnam=0,gt=0,ht=9; int arr2[][]= new int[2][arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rnd.nextInt(11)-5;arr2[0][i]=9;
        }
        for(int t=0;t<arr.length;t++)
        {
            for(int j=t+1;j<arr.length;j++)
            {
                if(arr[t]==arr[j]) {++colnam; gt=arr[t];}
            }
            if(colnam>1)
            {
            for(int i=0;i<arr.length;i++)
            {
                if(arr2[0][i]==gt) {ht++; }
            }
            if(ht==9){arr2[0][t]=gt;arr2[1][t]=colnam+1; }
            }
            ht=9;
            colnam=0;
        }
        for(int t=0;t<arr.length;t++)
        { System.out.print(arr[t]+" ");}
        System.out.println();
for(int t=0;t<arr.length;t++)
{
    if(arr2[0][t]!=9)
    {
    System.out.print(arr2[0][t]+" - "+arr2[1][t]+" раза\n");
    }
}

    }


}

