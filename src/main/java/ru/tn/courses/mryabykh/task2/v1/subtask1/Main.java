package ru.tn.courses.mryabykh.task2.v1.subtask1;

import ru.tn.courses.mryabykh.task2.v1.subtask1.exceptions.AdIsExistsException;
import ru.tn.courses.mryabykh.task2.v1.subtask1.models.Board;
import ru.tn.courses.mryabykh.task2.v1.subtask1.utils.AdUtils;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 */

public class Main {

    public static void main(String[] args) {
        int boardWidth = 100;
        int boardHeight = 100;
        int n = 5;
        int adWidth = boardWidth / 5;
        int adHeight = boardHeight / 5;
        Board board = new Board(boardWidth, boardHeight);
        try {
            board.attachAd(AdUtils.createAdList(n, adWidth, adHeight));
            System.out.println(board.toString());
        } catch (AdIsExistsException e) {
            e.printStackTrace();
        }
    }
}
