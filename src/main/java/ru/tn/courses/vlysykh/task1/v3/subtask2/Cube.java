package ru.tn.courses.vlysykh.task1.v3.subtask2;

/**
 * Created by Владимир on 04.03.2017.
 */
 class Cube {
    public static final int EDGE_COUNT = 6;
    private int edge;
    private boolean usage;
    private boolean isSet;

     Cube(int edge) {
        if (goodCube(edge)) {
            this.edge = edge;
        } else {
            throw new IllegalArgumentException("It's not a cube!@@x##@!!");
        }
    }

     void setUsage(boolean usage) {
        this.usage = usage;
    }

    void setIsSet(boolean set) {
        isSet = set;
    }

    void setEdge(int edge) {
        if (goodCube(edge)){
            this.edge = edge;
        } else {
            throw new IllegalArgumentException("It's not a cube!@@x##@!!");
        }

    }

    int getEdge() {
        return edge;
    }

    void showEdge() {
        System.out.print(" "+ this.edge);
    }

    boolean isUsage() {
        return usage;
    }

    boolean isSet() {
        return isSet;
    }

     boolean goodCube(int edge) {
        if (edge<EDGE_COUNT+1) {
            return true;
        }
            else {
                return false;
            }

    }
}
