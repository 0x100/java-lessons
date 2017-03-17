package ru.tn.courses.dpopov.task1.v2.subtask3;
import java.util.Scanner;
/**
 * Created by P.S.InDIGO on 14.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 0;
        System.out.println("Введите размер массива");
        N = scan.nextInt();

        int[] array = new int[N];
        for( int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100);
        }

        int max = 0;
        int index = 0;
        for(int i = 0; i < array.length; i++){
            max = array[i];
            for(int j = i + 1; j < array.length; j++){
                if(max < array[j]){
                    max = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = max;
        }

        for(int i = 0; i < array.length; i++){
            System.out.print("["+array[i]+"]"+"");
        }
    }
}