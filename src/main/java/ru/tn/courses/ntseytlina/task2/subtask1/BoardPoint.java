package ru.tn.courses.ntseytlina.task2.subtask1;

import java.awt.*;

public class BoardPoint extends Point implements Comparable<BoardPoint>{

    public BoardPoint(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "x = " + this.x + ", y = " + this.y;
    }


    @Override
    public int compareTo(BoardPoint o) {
        return this.x - o.x;
    }
}
