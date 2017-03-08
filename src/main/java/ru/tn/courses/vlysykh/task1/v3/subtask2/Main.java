package ru.tn.courses.vlysykh.task1.v3.subtask2;

/**
 * Created by Владимир on 04.03.2017.
 */
public class Main {

    public static final int SIZE = 10;
    public static final int POSITION = 0;

    public static void main(String[] args) {
        Lock lock1 = new Lock(SIZE);
        lock1.setCubeEdge(Lock.rndEdge(),Lock.rndCube());
        lock1.setCubeEdge(Lock.rndEdge(),Lock.rndCube());
        lock1.print();
        System.out.println();
        lock1.openTheLock(POSITION);
        lock1.lockIsOpen();
    }
}
