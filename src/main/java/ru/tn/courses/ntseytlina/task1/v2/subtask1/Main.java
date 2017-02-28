package ru.tn.courses.ntseytlina.task1.v2.subtask1;


public class Main {
    public static void main (String [] args) {
        Array array = new Array(5);
        array.fill();
        System.out.println(array);
        System.out.println(array.getIndexesOfZeroElements());
    }
}
