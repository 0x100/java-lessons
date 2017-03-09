package ru.tn.courses.dchernomorets.task1.v4.subtask3;
import java.util.Random;

/**
 * Created by ccc on 03.03.2017.
 */
public class Main {
    public static void main(String[] args){
        int[] Arr1=new int[5];
        int N=Arr1.length;
        Random r=new Random();
        System.out.println("Массив: ");
        for(int i=0;i<Arr1.length;i++)
        {
            Arr1[i]=r.nextInt(100);
            System.out.print(Arr1[i]+" ");
        }
        System.out.println();

        /*Вызов сортировки вставками*/
        SortingInsert(Arr1,N);

        System.out.println("Отсортированный массив: ");
        for(int j=0;j<N;j++)
        {
            System.out.print(Arr1[j]+" ");
        }

    }

    private static void SortingInsert(int[] Array1,int length1)
    {
        int temp,itemp1;
        for(int k=1;k<length1;k++)
        {
            temp=Array1[k];
            itemp1=k-1;
            while(itemp1>=0 && Array1[itemp1]>temp)
            {
                Array1[itemp1+1]=Array1[itemp1];
                Array1[itemp1]=temp;
                itemp1--;
            }
        }
    }
}
