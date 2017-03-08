package ru.tn.courses.vlysykh.task1.v3.subtask2;

import java.util.Random;

/**
 * Created by Владимир on 04.03.2017.
 */
public class Lock {
    private Cube[] cube;
    private boolean isHacked;

    public Lock(int size) {
        Cube[] cube = new Cube[size];
        for (int i=0; i<size; i++){
            cube[i] = new Cube(1);
        }
        this.cube = cube;
    }

    public void setCubeEdge(int edge, int cube) {
        this.cube[cube].setEdge(edge);
        this.cube[cube].setIsSet(true);
    }

    public void openTheLock(int position) {
        if (!this.cube[position].isUsage() && !this.cube[position].isSet()) {
            for (int i=1; i<7;i++) {
                roll2Cube(i, position);
            }
        } else {
            int i=this.cube[position].getEdge();
            roll2Cube(i,position);
        }
    }

    public void roll2Cube(int i, int position) {
        if (!this.cube[position+1].isUsage() && !this.cube[position+1].isSet()) {
            for (int j = 1; j < 7; j++) {
                roll3Cube(i,j,position);
            }
        } else {
            int j=this.cube[position+1].getEdge();
            roll3Cube(i,j,position);
        }
    }

    public void roll3Cube(int i, int j, int position) {
        if (!this.cube[position+2].isUsage() && !this.cube[position+2].isSet()) {
            for (int k = 1; k < 7; k++) {
                lockOpen(i,j,k,position);
            }
        } else {
            int k=this.cube[position+2].getEdge();
            lockOpen(i,j,k,position);
        }
    }

    public void lockOpen(int i, int j, int k, int position) {
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

    public boolean isOpen(int i,int j,int k){
        if (i + j + k == 10){
            return true;
        } else {
            return false;
        }
    }

    public void lockIsOpen(){
        if(this.isHacked){
            System.out.println("Замок открыт!");
        } else {
            System.out.println("Замок не открыт!");
        }
    }

    public void print() {
        for (int i=0; i<this.cube.length; i++) {
            this.cube[i].showEdge();
        }
        System.out.println();
    }

    public static int rndEdge(){
        Random rnd = new Random();
        int i = 6;
        i=rnd.nextInt(i)+1;
        return i;
    }

    public static int rndCube(){
        Random rnd = new Random();
        int i = 10;
        i=rnd.nextInt(i);
        return i;
    }
}



