package ru.tn.courses.dchernomorets.task1.v4.subtask1;

/**
 * Created by ccc on 03.03.2017.
 */
public class Main {
    public static void main(String[] args){
        int[] Array1=new int[]{1,2,3,4,5};
        boolean flag=false;
        for(int i=1; i< Array1.length; i++)
        {
            if(Array1[i]>Array1[i-1])
            {
                flag=true;
            }
            else
            {
                flag=false;
            }
        }
        if(flag==true)
        {
            System.out.println("Последовательность возрастающая");
        }
        else
        {
            System.out.println("Последовательность не возрастающая");
        }

    }
}

