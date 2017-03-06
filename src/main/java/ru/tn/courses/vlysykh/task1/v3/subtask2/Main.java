package ru.tn.courses.vlysykh.task1.v3.subtask2;

/**
 * Created by Владимир on 04.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Lock lock1 = new Lock(10);
        Lock lock2 = new Lock(10);

        lock1.print();
        lock1.setCubeEdge(5,0);
        lock1.setCubeEdge(2,1);
        lock1.print();
        System.out.println();
        lock1.openTheLock(0);


        lock2.setCubeEdge(6,0);
        lock2.setCubeEdge(5,1);
        lock2.print();
        lock2.openTheLock(0);

    }
}
