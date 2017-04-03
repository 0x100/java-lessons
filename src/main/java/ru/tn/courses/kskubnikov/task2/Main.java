package task2;

import task2.exception.OutOfBoardException;
import task2.model.Ad;
import task2.model.PinBoard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Кирилл on 25.03.2017.
 */
public class Main {
    public static void main(String[] args) throws OutOfBoardException, IOException {
        BufferedReader in = new BufferedReader(new FileReader("kskubnikov\\task2\\test.txt"));
        int boardW = Integer.valueOf(in.readLine());
        int boardH = Integer.valueOf(in.readLine());
        int quantityAd = Integer.valueOf(in.readLine());
        int adW = Integer.valueOf(in.readLine());
        int adH = Integer.valueOf(in.readLine());
        PinBoard board = new PinBoard(boardW, boardH);
        board.setAds(quantityAd, adH, adW);
        System.out.println(board.toString());
    }
}
