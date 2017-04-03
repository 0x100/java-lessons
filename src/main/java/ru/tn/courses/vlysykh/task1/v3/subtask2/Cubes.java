package ru.tn.courses.vlysykh.task1.v3.subtask2;

/**
 * Created by Владимир on 04.03.2017.
 */
 class Cubes {
    public static final int EDGE_COUNT = 6;
    private int edge;
    private boolean isUsage;
    private boolean isSet;

     Cubes(int edge) {
        if (isGoodCube(edge)) {
            this.edge = edge;
        } else {
            throw new IllegalArgumentException("It's not a cube!@@x##@!!");
        }
    }

     void setUsage(boolean usage) {
        this.isUsage = usage;
    }

    void setIsSet(boolean set) {
        isSet = set;
    }

    void setEdge(int edge) {
        if (isGoodCube(edge)){
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
        return isUsage;
    }

    boolean isSet() {
        return isSet;
    }

     boolean isGoodCube(int edge) {
         return edge<EDGE_COUNT+1;
    }
}
