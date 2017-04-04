package ru.tn.courses.mryabykh.task2.v1.subtask1.exceptions;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 */

public class AdIsExistsException extends Exception {
    public AdIsExistsException() {
        super("This ad is already attached to the board.");
    }

    public AdIsExistsException(String message) {
        super("This ad is already attached to the board." + message + "/n");
    }
}
