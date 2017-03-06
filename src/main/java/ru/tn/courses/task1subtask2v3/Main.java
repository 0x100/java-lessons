package ru.tn.courses.task1subtask2v3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static Random rnd = new Random();
    public static int it1 = 22; // место кубика в массиве
    public static int it2 = 0;  //место другого кубика в массиве
    public static int[] masNumber = new int[10];
    public static int first = 0, second = 0, third = 0;


    public static void main(String[] args) {
        cruchuVerchu();
        //System.out.println(Arrays.toString(rand(masNumber)));
        System.out.println(Arrays.toString(masNumber));
        System.out.println(it1 + " " + it2);
        int sumIt = masNumber[it1] + masNumber[it2];

        if (sumIt > 9 || sumIt < 4)
            System.out.println("Миша, все фигня, давай по новой");
        else {


            int group1 = it1 % 3;
            int group2 = it2 % 3;
            if (group1 == group2)
                System.out.println("Миша, все фигня, давай по новой");
            else {

                switch (it1) {
                    case 0:
                    case 3:
                    case 6:
                    case 9:
                        first = masNumber[it1];
                        break;
                    case 1:
                    case 4:
                    case 7:
                        second = masNumber[it1];
                        break;
                    case 2:
                    case 5:
                    case 8:
                        third = masNumber[it1];
                        break;
                }

                switch (it2) {
                    case 0:
                    case 3:
                    case 6:
                    case 9:
                        first = masNumber[it2];
                        break;
                    case 1:
                    case 4:
                    case 7:
                        second = masNumber[it2];
                        break;
                    case 2:
                    case 5:
                    case 8:
                        third = masNumber[it2];
                        break;
                }
                if (first == 0)
                    first = 10 - second - third;
                else if (second == 0)
                    second = 10 - first - third;
                else third = 10 - first - second;

                System.out.println(first + " " + second + " " + third + " " + first + " " + second + " " + third + " " +
                        first + " " + second + " " + third + " " + first);


            }
        }
    }

    public static int[] rand(int[] mas) {

        for (int i = 0; i < 2; i++) {
            int j = (int) (Math.random() * 10);
            mas[j] = (int) (Math.random() * 6) + 1;
            if (j == it1) {
                mas[j] = 0;
                mas[it1] = 22;
                rand(masNumber);
            }
            it2 = it1;
            it1 = j;
        }
        return mas;
    }


    private static void cruchuVerchu() {
        int [] indeces = new int[2];
        LinkedList<Integer> used = new LinkedList<>();
        for (int i = 0; i < 2; i++) {
            Integer a;
            do {
                a = rnd.nextInt(10);
            }
            while (used.contains(a));
            used.add(a);
            indeces[i] = a;
            int arrElement;
            do {
                arrElement = rnd.nextInt(7);
            } while (arrElement == 0);
            masNumber[a] = arrElement;
        }
        it1 = indeces[0];
        it2 = indeces[1];
    }

}