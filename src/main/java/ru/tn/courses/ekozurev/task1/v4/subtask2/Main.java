package ru.tn.courses.ekozurev.task1.v4.subtask2;

/**
 * Created by Egor on 31.05.2017.
 */
public class Main {
    public static void main(String[] args) {

        int     massif3[] = {23, 54, 54, 23, 12, 73, 564, 23, 86, 23, 85, 34, 23, 33, 65, 23, 64, 65};

        //Task2
        System.out.println("Task 2");
        int stepen = 2;
        int index = 0;
        for(int i = 0; Math.pow(stepen ,i) <= massif3.length-1; i++) {
            index = (int) Math.pow(stepen, i);
            System.out.println(massif3[index]);
        }
    }
}
