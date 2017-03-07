package ru.tn.courses.vlysykh.task1.v3.subtask2;

/**
 * Created by Владимир on 04.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Lock lock1 = new Lock(10);
        lock1.print();
        lock1.setCubeEdge(Lock.rndEdge(),0);
        lock1.setCubeEdge(Lock.rndEdge(),1);
        lock1.print();
        System.out.println();
        lock1.openTheLock(0);
    }
}
