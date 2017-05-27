package main.java.ru.tn.courses.dmakoshenko.task2.v2.subtask1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Danil on 14.05.2017.
 */
public class Main {
    private static Board board;

    public static void main(String[] args){
        if (Init()){
            System.out.println("Count nails: " + board.GetCountNails());
        }
    }

    private static boolean Init() {
        board = new Board();

        Scanner in = new Scanner(System.in);
        int width = 0;
        int height = 0;
        while (width < 100 || height < 100) {
            System.out.println("Enter the size of the board:");
            System.out.print("width: ");
            width = in.nextInt();
            System.out.print("height: ");
            height = in.nextInt();
            if (width < 100) System.out.println("The board width should be greater than or equal to 100");
            if (height < 100) System.out.println("The board width height be greater than or equal to 100");
        }
        board.SetSizeBoard(width,height);

        width = 0;
        height = 0;
        while (width < 4 || height < 4 || width > board.sizeBoard[0] / 5 || height > board.sizeBoard[1] / 5) {
            System.out.println("Enter the size of the ad:");
            System.out.print("width: ");
            width = in.nextInt();
            System.out.print("height: ");
            height = in.nextInt();
            if (width < 4) System.out.println("The ad width should be greater than or equal to 4");
            if (width > board.sizeBoard[0] / 5)
                System.out.println("The ad width should be less than or equal to " + board.sizeBoard[0] / 5);
            if (height < 4) System.out.println("The ad height should be greater than or equal to 4");
            if (height > board.sizeBoard[0] / 5)
                System.out.println("The ad height should be less than or equal to " + board.sizeBoard[1] / 5);
        }
        board.SetSizeAdvertisment(width,height);
        int countAds = 0;
        while (countAds < 5) {
            System.out.print("Enter the number of ads:");
            countAds = in.nextInt();
            if (countAds < 5) System.out.println("The number of ads must be greater than or equal to 5");
        }
        for(int i = 0; i < countAds; i++) {
            if (!board.AddAdvertisment()) {
                System.out.print("The board did not match all ads");
                return false;
            }
        }
        return true;
    }
}