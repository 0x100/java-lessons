package ru.tn.courses.dpopov.task1.v2.subtask1;


/**
 * Created by P.S.InDIGO on 05.03.2017.
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int razmer = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input number");
        razmer = scan.nextInt();

        int[] array = new int[razmer];
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < array.length; i++ ){
            array[i] = (int) (Math.random() * 10);
            System.out.print("["+array[i]+"]"+" ");

            if(array[i] == 0){
                list.add(i);
            }
        }
        System.out.println("");
        for(int i = 0; i < list.size(); i++){
            System.out.print(list);
        }
    }
}
