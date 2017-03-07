package ru.tn.courses.ntseytlina.task1.v2.subtask3;

public class Main {
    public static void main (String [] args) {
        Array array = new Array(5);
        System.out.println("Not sorted array:");
        System.out.println(array);
        array.selectionSort();
        System.out.println("Sorted array:");
        System.out.println(array);
    }
}
