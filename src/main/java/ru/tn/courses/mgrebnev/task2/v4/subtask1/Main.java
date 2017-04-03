package ru.tn.courses.mgrebnev.task2.v4.subtask1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max on 02.04.2017.
 */

public class Main {
    static List<Paper> holdPaper = new ArrayList<Paper>();
    static List<Nail> holdNail = new ArrayList<Nail>();

    //Кол - во объявлений
    static int N = 5;
    // Ширина доски
    static int A = 100;
    // Высота доски
    static int B = 100;
    // Ширина и высота объявления
    static int Cn = A / 5;
    static int Dn = B / 5;

    static void showNail(){
        for (int i = 0; i < holdNail.size(); i++){
            System.out.println("Гвоздь #" + (i + 1)+ " (" + holdNail.get(i).x + "," + holdNail.get(i).y + ")");
        }
        System.out.println("\nКоличество гвоздей: " + holdNail.size());
    }

    static void showPaper(){
        for(int i = 0; i < holdPaper.size(); i++){
            System.out.println("Объявление #" + (i + 1) + " (" + holdPaper.get(i).left +
                                "," +
                                holdPaper.get(i).top +
                                "," +
                                holdPaper.get(i).right +
                                "," +
                                holdPaper.get(i).bottom
                                + ")");
        }
        System.out.println();
    }

    public static void main(String[] args){

        int left = 0;
        int right = Cn;
        int top = 0;
        int bottom = Dn;

        int nailX1 = 2;
        int previousNailX1 = nailX1;

        int nailY1 = 2;

        while(bottom <= B){
            while(right <= A){
                N--;

                holdPaper.add(new Paper(left,right,top,bottom));

                if (!holdNail.contains(new Nail(nailX1,nailY1))){
                    holdNail.add(new Nail(nailX1,nailY1));
                }

                left += Cn - 3;
                right = left + Cn;

                previousNailX1 = nailX1;
                nailX1 = left + 1;

                if (!holdNail.contains(new Nail(previousNailX1 ,nailY1 + Dn))){
                    holdNail.add(new Nail(previousNailX1 ,nailY1 + Dn));
                }

                if (N == 0){
                    showPaper();
                    showNail();
                    return;
                }

            }
            top += Dn;
            bottom += Dn;
            nailY1 = nailY1 + Dn ;
            left = 0;
            right = Cn;
            nailX1 = 2;
        }

        System.out.println("Недопустимое количество объявлений");

    }
}
