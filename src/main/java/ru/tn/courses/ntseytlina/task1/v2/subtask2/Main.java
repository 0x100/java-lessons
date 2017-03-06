package ru.tn.courses.ntseytlina.task1.v2.subtask2;

import java.util.Random;

public class Main {
    private static String [] banksNames;
    private static float [] courses;
    private static final int size = 15;

    public static void main (String [] args) {
        init();

        for (int i = 0; i < size; i++) {
            System.out.println(banksNames[i] + ": " + courses[i]);
        }

        System.out.println("The best course bank: " + banksNames[getBestCourseBank()]);
        System.out.println("Course: " + courses[getBestCourseBank()]);
    }

    public static void init () {
        banksNames = new String[size];
        courses = new float[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            banksNames[i] = "Bank " + (i + 1);
            courses[i] = random.nextInt(50) + 50;
        }
    }

    public static int getBestCourseBank() {
        int max = 0;
        for (int i = 0; i < size; i++) {
            if (courses[max] < courses[i]) {
                max = i;
            }
        }
        return max;
    }
}
