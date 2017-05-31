package ru.tn.courses.ekozurev.task1.v4.subtask1;

/**
 * Created by Egor on 31.05.2017.
 */
public class Main {
    public static void main(String[] args) {

        double  massif1[] = {3.4, 4.765, 8.464, 9.3452};
        double  massif2[] = {35.567, 23.65, 34.5465, 234.353};
        Massifs myClass = new Massifs();

        //Task1
        System.out.println("Task 1");
        if(myClass.checkArrayGrowth(massif1)) {
            System.out.println("massif 1 is grows");
        } else {
            System.out.println("massif 1 isn't grows");
        }
        if(myClass.checkArrayGrowth(massif2)) {
            System.out.println("massif 2 is grows");
        } else {
            System.out.println("massif 2 isn't grows");
        }
    }
}
