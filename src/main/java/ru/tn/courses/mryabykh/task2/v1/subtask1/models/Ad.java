package ru.tn.courses.mryabykh.task2.v1.subtask1.models;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 */

public class Ad {

    private int width;
    private int height;
    private Coordinates coordinates;

    public Ad(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


}
