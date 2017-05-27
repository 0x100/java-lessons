package main.java.ru.tn.courses.dmakoshenko.task2.v2.subtask1;

/**
 * Created by Danil on 14.05.2017.
 */
public class Board {
    Advertisment[][] ads;
    int[] sizeAdvertisment = new int[2];
    int[] sizeBoard = new int[2];

    public void SetSizeBoard(int x, int y) {
        sizeBoard[0] = x;
        sizeBoard[1] = y;
    }
    public void SetSizeAdvertisment(int x, int y) {
        if (sizeBoard[0] < 5 || sizeBoard[1] < 5) return;
        sizeAdvertisment[0] = x;
        sizeAdvertisment[1] = y;
        int[] CountAds = new int[2];
        CountAds[0] = 1;
        CountAds[1] = 1;
        int width = sizeAdvertisment[0];
        for (CountAds[0] = 0; width < sizeBoard[0]; CountAds[0]++){
            width+=sizeAdvertisment[0]-3;
        }
        int height = sizeAdvertisment[1];
        for (CountAds[1] = 0; height < sizeBoard[1]; CountAds[1]++){
            height+=sizeAdvertisment[1]-3;
        }
        ads = new Advertisment[CountAds[0]][];
        for(int i = 0; i < ads.length; i++)
            ads[i] = new Advertisment[CountAds[1]];

    }
    public boolean AddAdvertisment(){
        for(int i = 0; i < ads.length; i++){
            for (int j = 0; j < ads[i].length; j++){
                if (ads[i][j] == null){
                    ads[i][j] = new Advertisment();
                    if (i==0 && j==0) ads[i][j].setNail(true,true);
                    if (i==0) ads[i][j].setNail(true, false);
                    if (j==0) ads[i][j].setNail(false, true);
                    ads[i][j].setNail(false, false);
                    return true;
                }
            }
        }
        return false;
    }
    public int GetCountNails(){
        int count = 0;
        for(Advertisment[] yAds: ads)
            for(Advertisment advertisment: yAds)
                count += advertisment == null?0:advertisment.GetCountNails();
        return count;
    }
}


































