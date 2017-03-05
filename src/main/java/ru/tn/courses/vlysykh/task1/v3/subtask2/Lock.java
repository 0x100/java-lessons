package ru.tn.courses.vlysykh.task1.v3.subtask2;

/**
 * Created by Владимир on 04.03.2017.
 */
public class Lock {
    private Cube[] cube;

    public Lock(int size) {
        Cube[] cube = new Cube[size];
        for (int i=0; i<size; i++){
            cube[i] = new Cube(1);
        }
        this.cube = cube;
    }

    public void setCubeEdge(int edge, int cube) {
        this.cube[cube].setEdge(edge);
        this.cube[cube].setUsage(true);
    }


    public void openTheLock(int position) {
        if (!this.cube[position].isUsage()) {
            for (int i=1; i<7;i++) {
                roll2Cube(i, position);
            }
        } else {
            int i=this.cube[position].getEdge();
            roll2Cube(i,position);
        }

    }
    public void roll2Cube(int i, int position) {
        if (!this.cube[position+1].isUsage()) {
            for (int j = 1; j < 7; j++) {
                roll3Cube(i,j,position);
        }
        } else {
            int j=this.cube[position+1].getEdge();
            roll3Cube(i,j,position);
    }
}

    public void roll3Cube(int i, int j, int position) {
        if (!this.cube[position+2].isUsage()) {
            for (int k = 1; k < 7; k++) {
            lockOpen(i,j,k,position);
            }
        } else {
            int k=this.cube[position+2].getEdge();
            lockOpen(i,j,k,position);
        }
    }

    public void lockOpen(int i, int j, int k, int position) {
        if (i + j + k == 10) {
            this.cube[position].setEdge(i);
            this.cube[position+1].setEdge(j);
            this.cube[position+2].setEdge(k);
            print();
            System.out.println("Замок открыт!");
            System.out.println();
        }
    }

    public void print() {
        for (int i=0; i<this.cube.length; i++) {
            this.cube[i].showEdge();
        }
        System.out.println();
        }
    }



