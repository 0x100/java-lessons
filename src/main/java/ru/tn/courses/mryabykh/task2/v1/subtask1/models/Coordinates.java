package ru.tn.courses.mryabykh.task2.v1.subtask1.models;

import java.util.Arrays;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 */

public class Coordinates {

    private int[] coordinates;

    public Coordinates(int left, int top, int right, int bottom) {
        this.coordinates = new int[]{left, top, right, bottom};
    }

    public Coordinates(int left, int top) {
        this.coordinates = new int[]{left, top};
    }

    public int[] getNailCoordinates() {
        return coordinates;
    }

    public int[] getAdCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "coordinates=" + Arrays.toString(coordinates) +
                '}';
    }
}
