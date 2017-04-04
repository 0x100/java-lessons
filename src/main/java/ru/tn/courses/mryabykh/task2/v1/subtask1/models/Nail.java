package ru.tn.courses.mryabykh.task2.v1.subtask1.models;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 */

public class Nail {

    private int x;
    private int y;
    private Coordinates coordinates;

    public Nail(int x, int y) {
        this.x = x;
        this.y = y;
        this.coordinates = new Coordinates(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Nail nail = (Nail) obj;

        return x == nail.x && y == nail.y;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
