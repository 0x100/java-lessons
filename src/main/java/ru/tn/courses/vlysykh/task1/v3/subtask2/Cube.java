package ru.tn.courses.vlysykh.task1.v3.subtask2;

/**
 * Created by Владимир on 04.03.2017.
 */
public class Cube {
    private int edge;
    private boolean usage;
    private boolean isSet;

    public Cube(int edge) {
        if (goodCube(edge)) {
            this.edge = edge;
        } else {
            throw new IllegalArgumentException("It's not a cube!@@x##@!!");
        }
    }

    public void setUsage(boolean usage) {
        this.usage = usage;
    }

    public void setIsSet(boolean set) {
        isSet = set;
    }

    public void setEdge(int edge) {
        if (goodCube(edge)){
            this.edge = edge;
        } else {
            throw new IllegalArgumentException("It's not a cube!@@x##@!!");
        }

    }

    public int getEdge() {
        return edge;
    }

    public void showEdge() {
        System.out.print(" "+ this.edge);
    }

    public boolean isUsage() {
        return usage;
    }

    public boolean isSet() {
        return isSet;
    }

    public boolean goodCube(int edge) {
        if (edge<7) {
            return true;
        }
            else {
                return false;
            }

    }
}
