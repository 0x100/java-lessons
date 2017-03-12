package ru.tn.courses.vlysykh.task1.v3.subtask2;

import java.util.Random;

/**
 * Created by Владимир on 04.03.2017.
 */
public class Lock {
    private static final int SIZE = 10;
    private Cube[] cube;
    private boolean isHacked;

    public Lock() {
        Cube[] cube = new Cube[SIZE];

        for (int i=0; i<SIZE; i++){
            cube[i] = new Cube(0);
        }
        int rndCube1 = rndCube();
        int rndCube2 = rndCube();
        this.cube = cube;

        while (rndCube1==rndCube2){
            rndCube2 = rndCube();
        }
        cube[rndCube1].setEdge(rndEdge());
        cube[rndCube1].setIsSet(true);
        cube[rndCube2].setEdge(rndEdge());
        cube[rndCube2].setIsSet(true);

        this.cube = cube;
    }

    public void print() {
        for (int i=0; i<this.cube.length; i++) {
            this.cube[i].showEdge();
        }
        System.out.println();
        System.out.println();
    }

    public void openTheLock() {
        if (!this.cube[0].isUsage() && !this.cube[0].isSet()) {
            for (int i=1; i<7;i++) {
                roll2Cube(i, 0);
            }
        } else {
            int i=this.cube[0].getEdge();
            roll2Cube(i,0);
        }
        lockIsOpen();
    }


    private void openTheLock(int position) {
        if (!this.cube[position].isUsage() && !this.cube[position].isSet()) {
            for (int i=1; i<7;i++) {
                roll2Cube(i, position);
            }
        } else {
            int i=this.cube[position].getEdge();
            roll2Cube(i,position);
        }
    }

    private void roll2Cube(int i, int position) {
        if (!this.cube[position+1].isUsage() && !this.cube[position+1].isSet()) {
            for (int j = 1; j < 7; j++) {
                roll3Cube(i,j,position);
            }
        } else {
            int j=this.cube[position+1].getEdge();
            roll3Cube(i,j,position);
        }
    }

    private void roll3Cube(int i, int j, int position) {
        if (!this.cube[position+2].isUsage() && !this.cube[position+2].isSet()) {
            for (int k = 1; k < 7; k++) {
                lockOpen(i,j,k,position);
            }
        } else {
            int k=this.cube[position+2].getEdge();
            lockOpen(i,j,k,position);
        }
    }

    private void lockOpen(int i, int j, int k, int position) {
        if (isOpen(i,j,k)) {
            this.cube[position].setEdge(i);
            this.cube[position].setUsage(true);
            this.cube[position+1].setEdge(j);
            this.cube[position+1].setUsage(true);
            this.cube[position+2].setEdge(k);
            this.cube[position+2].setUsage(true);
            position++;
            if (position<this.cube.length-2) {
                openTheLock(position);
            } else {
                print();
                this.isHacked=true;
            }
        } else {
            this.cube[position].setUsage(false);
            this.cube[position+1].setUsage(false);
            this.cube[position+2].setUsage(false);
        }
    }

    private boolean isOpen(int i,int j,int k){
        if (i + j + k == 10){
            return true;
        } else {
            return false;
        }
    }

    private void lockIsOpen(){
        if(this.isHacked){
            System.out.println("Замок открыт!");
        } else {
            System.out.println("Замок не открыт!");
        }
    }

    private int rndEdge(){
        Random rnd = new Random();
        int i = 6;
        i=rnd.nextInt(i)+1;
        return i;
    }

    private int rndCube(){
        Random rnd = new Random();
        int i = 10;
        i=rnd.nextInt(i);
        return i;
    }
}



