package ru.tn.courses.mgrebnev.task2.v4.subtask1;

/**
 * Created by Max on 02.04.2017.
 */
public class Nail {
    public int x;
    public int y;

    public Nail(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nail nail = (Nail) o;

        if (x != nail.x) return false;
        return y == nail.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
