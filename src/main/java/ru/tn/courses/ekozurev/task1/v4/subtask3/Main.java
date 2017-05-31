package ru.tn.courses.ekozurev.task1.v4.subtask3;

/**
 * Created by Egor on 31.05.2017.
 */
public class Main {
    public static void main(String[] args) {

        double  massif1[] = {3.4, 4.765, 8.464, 9.3452};
        double  massif2[] = {35.567, 23.65, 34.5465, 234.353};
        int     massif3[] = {23, 54, 54, 23, 12, 73, 564, 23, 86, 23, 85, 34, 23, 33, 65, 23, 64, 65};
        Massifs myClass = new Massifs();

        //Task 3
        System.out.println("Task 3");
        massif3 = myClass.insertionSort(massif3);
        for (int i = 0; i < massif3.length; i++) {
            System.out.println(massif3[i] + " ");
        }
    }
}
