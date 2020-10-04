package ua.step.practice;

/**
 * Заполнить массив на 15 элементов числами Фибоначчи.
 * Вывести на консоль только четные элементы массива.
 * <p>
 * Пример вывода:
 * 1 2 5 13 34 89 233 610
 */
public class Task01 {
    public static void main(String[] args) {
        // TODO: Пишите код здесь
 int mar[]=new int [15];
        int n0 = 1;
        int n1 = 1;
        mar[0]=n0;mar[1]=n1;
        int n2;
        for(int i = 2; i < 15; i++){
            n2=n0+n1;
            mar[i]=n2;
            n0=n1;
            n1=n2;
        }
        for(int t=0;t<15;t++)
        {
            if(t%2==0) System.out.print(mar[t]+" ");
        }
    }
}