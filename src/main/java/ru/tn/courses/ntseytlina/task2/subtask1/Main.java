package ru.tn.courses.ntseytlina.task2.subtask1;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main (String [] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException  {
        BoardCreator boardCreator = BoardCreator.getBoardCreator();

        Ads ads = boardCreator.setNewAdParameters(5, 5, 5);

        try {
            ads.fillAdsForBounds(7, 9);
            System.out.println(ads);
        } catch (AdsSquareMoreThanBoardException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        ads = boardCreator.setNewAdParameters(8, 5, 6);

        try {
            ads.fillAdsForBounds(8, 9);
            System.out.println(ads);
        } catch (AdsSquareMoreThanBoardException e) {
            System.out.println(e.getMessage());
        }

        try {
            ads.fillAdsForBounds(11, 9);
            System.out.println(ads);
        } catch (AdsSquareMoreThanBoardException e) {
            System.out.println(e.getMessage());
        }
    }
}
