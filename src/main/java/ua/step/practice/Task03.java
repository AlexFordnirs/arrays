package ua.step.practice;

import java.util.Scanner;

/**
 * Задание: Написать программу, которая проверяет, все ли значения
 * элементов массива одинаковые. Вывести: Yes – если все оди-
 * наковы и No – если имеется хоть одно различие.
 * Размер массива задается и инициализируется в начале программы.
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();
        // TODO: Пишите код здесь
        int[] arr = new int[len]; int y,h=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        y=arr[0];
        for(int t=0;t<arr.length;t++){
            if(y==arr[t]) h=1;
            else if(y!=arr[t]) {h=2;break;}
        }
        System.out.println(h==1? "Yes":"No");
    }
}
