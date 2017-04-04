package ru.tn.courses.ptihomirov.task1.v1.subtask1;
/**
 * Created by Павел on 12.03.2017.
 */
public class Main
{
    public static void main (String args[])
    {
        int n = 10; // кол-во элементов в массиве
        int k = ((int) (Math.random() * 10)) + 1;
        int Sum = 0;
        int Arr[] = new int[n];

        System.out.print("K = " + k + "\n");
        for(int i = 0; i < n; i++) // инициализируем массив случайными натуральными числами
        {
            Arr[i] = ((int) (Math.random() * 100)) + 1;
            System.out.print(Arr[i] + " ");
        }
        for(int i = 0; i < n; i++) // проверка элементов массива на кратность числу k
        {
            if(Arr[i] % k == 0)
            {
                Sum += Arr[i];
            }
        }
        System.out.print("\n" + "Сумма = " + Sum);
    }
}
