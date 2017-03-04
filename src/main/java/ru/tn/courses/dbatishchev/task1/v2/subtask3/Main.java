package ru.tn.courses.dbatishchev.task1.v2.subtask3;

import ru.tn.courses.dbatishchev.task1.v2.Aux;

/**
 * Created by ii343hbka on 01/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        int[] intSeq = Aux.randomIntSequence(10, -100, 100);

        for(int i = 0; i < intSeq.length; i++) {
            int maxEl = intSeq[i];
            int maxPos = i;

            for (int j = i; j < intSeq.length; j++)
                if (intSeq[j] > maxEl) {
                    maxEl = intSeq[j];
                    maxPos = j;
                }
            // swap
            if (maxPos != i) {
                int buf = intSeq[i];
                intSeq[i] = intSeq[maxPos];
                intSeq[maxPos] = buf;
            }
            System.out.print(intSeq[i] + " ");
        }
    }
}
