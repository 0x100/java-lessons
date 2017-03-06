package ru.tn.courses.dyatsynyuk.task1.v4.DifficultTask;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by dasha on 06.03.2017.
 */
public class Main {
    private final int SIZE=10;
    private int[] data=new int[SIZE];
    private int firstIndex=0;
    private int secondIndex=0;
    private int currentSum=0;
    private int first=0;
    private int second=0;

    private void insertData()
    {
        for(int i=0; i<SIZE; i++)
        {
            data[i]=0;
        }
        firstIndex=randomIndex();
        secondIndex=randomIndex();
        while(secondIndex==firstIndex)
        {
            secondIndex=randomIndex();
        }
        first=randomNumber();
        second=randomNumber();
        data[firstIndex]=first;
        data[secondIndex]=second;
        currentSum=data[firstIndex]+data[secondIndex];
    }

    private int randomNumber(){

        Random rand = new Random();
        int randomNum = rand.nextInt(6)+1;
        return randomNum;
    }

    private int randomIndex(){

        Random rand = new Random();
        int randomNum = rand.nextInt(10);
        return randomNum;
    }

    public void guessKey(){
        if(firstIndex%3==secondIndex%3 && data[firstIndex]!=data[secondIndex])
        {
            System.out.println("Impossible to get key");
            return;
        }
        else if(firstIndex%3==secondIndex%3 && data[firstIndex]==data[secondIndex])
        {
            second=(10-first)/2;
            int index=firstIndex%3;
            while (index<10)
            {
                data[index]=first;
                index+=3;
            }
            int i=0;
            while(data[i]!=0)
            {
                i++;
            }
            while(i<10)
            {
                data[i]=10-(second+first);
                i+=3;
            }
            i=0;
            while(data[i]!=0)
            {
                i++;
            }
            currentSum=second+first;
            while(i<10)
            {
                data[i]=10-currentSum;
                i+=3;
            }
        }
        else if(currentSum>=10 || (10-currentSum)>6) {
            System.out.println("Impossible to get key");
            return;
        }
        else
        {
            int index=firstIndex%3;
            while (index<10)
            {
                data[index]=first;
                index+=3;
            }
            index=secondIndex%3;
            while(index<10)
            {
                data[index]=second;
                index+=3;
            }
            int i=0;
            while(data[i]!=0)
            {
                i++;
            }
            while(i<10)
            {
                data[i]=10-(second+first);
                i+=3;
            }
        }
        printArray();
    }

    public Main(){
        insertData();
        printArray();
    }

    public void printArray()
    {
        System.out.println(Arrays.toString(data));
    }

    public static void main(String [ ] args)
    {
            Main array=new Main();
            array.guessKey();
    }
}
