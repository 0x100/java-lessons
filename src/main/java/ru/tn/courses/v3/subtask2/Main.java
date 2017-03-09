package ru.tn.courses.v3.subtask2;

import java.util.Arrays;
import java.util.Random;


/**
 * Created by ii343hbka on 09/03/2017.
 */
public class Main {
    public static int nextRndInt(int bound) {
        return (new Random().nextInt(bound)) + 1; // from 1 to bound(inclusive)
    }

    public static void main(String[] args) {


        Random rnd = new Random();

        boolean hackSucceed = false;
        //init arr
        int kk[] = new int[10];
        int luckyNumber = 0;
        kk[rnd.nextInt(10)] = nextRndInt(6);
        kk[rnd.nextInt(10)] = nextRndInt(6);
        System.out.println("init state: " + Arrays.toString(kk));

        if (kk[0] == 0)
            kk[0] = 3;
        for (int i = 1; i < kk.length - 1; i++) {
            if (hackSucceed) {
                if (kk[i] == 0) kk[i] = 1;
                continue;
            }

            if (kk[i] == 0) {
                // assume that left cell is always filled, thus check only right
                if (kk[i + 1] != 0) {
                    int mn = (kk[i - 1] + kk[i + 1]); // stands for magic number
                    if (mn >= 10) {
                        kk[i] = 1; // lets try at next step with lowest possible cell
                    } else
                        kk[i] = 10 - mn; // wow. lucky. adjusted to fit condition boundaries
                } else
                    kk[i] = (10 - kk[i - 1]) / 2; // hope it was big enough to sum up to 10 at next step
            }
            int mn = (kk[i - 1] + kk[i]);
            if (mn < 10) // what if we are lucky to find a solution at next step. Otherwise - give up
                if (kk[i + 1] == 0) kk[i + 1] = 10 - mn;


            // maybe we had set right values at right places
            if (kk[i - 1] + kk[i] + kk[i + 1] == 10 && !hackSucceed) {
                hackSucceed = true;
                luckyNumber = i;
            }
        }
        if (kk[9] == 0) kk[9] = 1;

        if (hackSucceed)
            System.out.println("hack succeed");
        else
            System.out.println("fail. try again");
        System.out.println("refilled stated: " + Arrays.toString(kk));
        System.out.println(String.format("winning pos: [%d][%d][%d]", luckyNumber - 1, luckyNumber, luckyNumber + 1));

    }
}
