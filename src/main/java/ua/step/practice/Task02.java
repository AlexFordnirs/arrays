package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;

/**
 * Задание: Заполнить массив на 30 элементов случайными числами
 * от -70 до +50.
 * Найти минимальный элемент и максимальный элементы и вывести их на консоль через пробел
 */
public class Task02 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - необходимо для тестирования @see ua.step.homework.TaskTest02
        long seed = 0;// args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
 int min=0,max=0;
        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);
 int mor[]=new int[30];
        // TODO: Пишите код здесь
        for (int i = 0; i < 30; i++) {
            mor[i]=(rnd.nextInt(51+70) - 70);
        }
        for (int i = 0; i < 30; i++) {
            if(max< mor[i]){max= mor[i];}
            if(min> mor[i]){ min=mor[i];}
        }
        System.out.println(min+" "+max);
    }
}
