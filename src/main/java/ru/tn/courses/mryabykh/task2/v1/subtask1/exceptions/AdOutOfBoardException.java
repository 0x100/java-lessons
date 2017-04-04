package ru.tn.courses.mryabykh.task2.v1.subtask1.exceptions;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 */

public class AdOutOfBoardException extends RuntimeException {
    public AdOutOfBoardException() {
        super("Error! You have gone beyond the board. There is no more space on the board.");
    }

    public AdOutOfBoardException(String message) {
        super("Error! You have gone beyond the board. There is no more space on the board." + message + "\n");
    }
}
