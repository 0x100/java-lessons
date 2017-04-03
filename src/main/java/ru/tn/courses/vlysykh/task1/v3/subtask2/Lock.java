package ru.tn.courses.vlysykh.task1.v3.subtask2;

import java.util.Random;

/**
 * Created by Владимир on 04.03.2017.
 */
public class Lock {
    private static final int SIZE = 10;
    private static final int START_POSITION = 0;
    public static final int REQUIREMENT = 10;
    private static final boolean PRESET = true;
    private Cubes[] cubes;
    private boolean isHacked;

    public Lock() {
       this(SIZE);
    }

    public Lock(int size) {
        Cubes[] cubes = new Cubes[size];

        for (int i=0; i<size; i++){
            cubes[i] = new Cubes(START_POSITION);
        }
        this.cubes = cubes;

        if (PRESET) {
            preSet(size);
            this.cubes = cubes;
        }
    }

    public void print() {
        for (int i = 0; i<this.cubes.length; i++) {
            this.cubes[i].showEdge();
        }
        System.out.println();
    }

    public void openTheLock() {
       openTheLock(START_POSITION);
       lockIsOpen();
    }

    private void openTheLock(int position) {
        if (!this.cubes[position].isUsage() && !this.cubes[position].isSet()) {
            for (int firstCubeValue = 1; firstCubeValue<=getMaxCubeValue(); firstCubeValue++) {
                roll2Cube(firstCubeValue, position);
            }
        } else {
            int firstCubeValue=this.cubes[position].getEdge();
            roll2Cube(firstCubeValue,position);
        }
    }

    private void roll2Cube(int firstCubeValue, int position) {
        if (!this.cubes[position+1].isUsage() && !this.cubes[position+1].isSet()) {
            for (int secondCubeValue = 1; secondCubeValue <= getMaxCubeValue(); secondCubeValue++) {
                roll3Cube(firstCubeValue,secondCubeValue,position);
            }
        } else {
            int secondCubeValue=this.cubes[position+1].getEdge();
            roll3Cube(firstCubeValue,secondCubeValue,position);
        }
    }

    private void roll3Cube(int firstCubeValue, int secondCubeValue, int position) {
        if (!this.cubes[position+2].isUsage() && !this.cubes[position+2].isSet()) {
            for (int thirdCubeValue = 1; thirdCubeValue <= getMaxCubeValue(); thirdCubeValue++) {
                lockOpen(firstCubeValue,secondCubeValue,thirdCubeValue,position);
            }
        } else {
            int thirdCubeValue=this.cubes[position+2].getEdge();
            lockOpen(firstCubeValue,secondCubeValue,thirdCubeValue,position);
        }
    }

    private void lockOpen(int firstCubeValue, int secondCubeValue, int thirdCubeValue, int position) {
        if (isOpen(firstCubeValue,secondCubeValue,thirdCubeValue)) {
            this.cubes[position].setEdge(firstCubeValue);
            this.cubes[position].setUsage(true);
            this.cubes[position+1].setEdge(secondCubeValue);
            this.cubes[position+1].setUsage(true);
            this.cubes[position+2].setEdge(thirdCubeValue);
            this.cubes[position+2].setUsage(true);
            position++;
            if (position<this.cubes.length-2) {
                openTheLock(position);
            } else {
                print();
                this.isHacked=true;
            }
        } else {
            this.cubes[position].setUsage(false);
            this.cubes[position+1].setUsage(false);
            this.cubes[position+2].setUsage(false);
        }
    }

    private boolean isOpen(int firstCubeValue,int secondCubeValue,int thirdCubeValue){
        return (firstCubeValue + secondCubeValue + thirdCubeValue == REQUIREMENT);
    }

    private void lockIsOpen(){
        if(this.isHacked){
            System.out.println("Замок открыт!");
        } else {
            System.out.println("Замок не открыт!");
        }
    }
    private void preSet (int size){
        int rndCube1 = rndCube(size);
        int rndCube2 = rndCube(size);
        while (rndCube1==rndCube2){
            rndCube2 = rndCube(size);
        }
        cubes[rndCube1].setEdge(rndEdge());
        cubes[rndCube1].setIsSet(true);
        cubes[rndCube2].setEdge(rndEdge());
        cubes[rndCube2].setIsSet(true);
    }

    private int rndEdge(){
        Random rnd = new Random();
        return rnd.nextInt(getMaxCubeValue())+1;
    }

    private int rndCube(int size){
        Random rnd = new Random();
        return rnd.nextInt(size);
    }
    
    private int getMaxCubeValue(){
        return (Cubes.EDGE_COUNT);
    }
}



