package ru.tn.courses.vlysykh.task1.v3.subtask2;

/**
 * Created by Владимир on 04.03.2017.
 */
public class Main {

    public static final int SIZE = 10;
    public static final int POSITION = 0;

    public static void main(String[] args) {
        int rndCube1 = Lock.rndCube();
        int rndCube2 = Lock.rndCube();

        while (rndCube1==rndCube2){
            rndCube2 = Lock.rndCube();
        }

        Lock lock1 = new Lock(SIZE);
        lock1.setCubeEdge(Lock.rndEdge(),rndCube1);
        lock1.setCubeEdge(Lock.rndEdge(),rndCube2);
        lock1.print();
        System.out.println();
        lock1.openTheLock(POSITION);
        lock1.lockIsOpen();
    }
}
