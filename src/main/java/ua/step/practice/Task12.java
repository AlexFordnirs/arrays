package ua.step.practice;

import java.util.Scanner;

/**
 * Программа должна выводить слово Yes для симметрич-
 * ного массива и слово No – для несимметричного. Симме-
 * тричным считается массив, в котором значения элементов с
 * конца равно значению элементов с начала. Массив заполняется
 * пользователем вручную.
 * Размер массива (количество строк и колонок) задается при
 * запуске программы.
 *
 * Примеры значений для симметричного массива:
 * <p>
 * 1, 2, 3, 2, 1
 * 2, 2, 3, 2, 2
 * 1, 3, 2, 3, 1
 * 5, 4, 3, 4, 5
 *
 *
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размернось массива (сколько строк и колонок): ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] marr= new int[rows][cols]; int y=cols,u=0,tr;
        // TODO: Пишите код здесь
        for (int t=0;t<rows;t++)
        {
            for (int i = 0; i < cols; i++)
            {
                marr[t][i]= tr = scanner.nextInt();
            }
        }
        for(int j=0;j<rows;j++)
        {
            for (int i = 0; i < cols; i++)
            {
                if (marr[j][i] != marr[j][cols - i - 1])
                { u += 1; }
            }
        }
        if (u ==0 )
        { System.out.println("yes");u=0;
        }
        else
        { System.out.println("no");u=0;
        }
    }
}
