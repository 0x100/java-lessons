package ru.tn.courses.dbatishchev.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ii343hbka on 01/03/2017.
 */
public class Exercise1 {

    private static final long seqSize = 100;
    private static final int seqLowBound = 0;
    private static final int seqUpperBound = 10;

    public static void main(String[] args) {
        int[] intSeq = Aux.randomIntSequence(seqSize, seqLowBound, seqUpperBound);
        Integer[] zeroElemIndices;
        List<Integer> zeroElemIndicesList = new ArrayList<>();

        for(int i = 0; i < intSeq.length; i++)
            if(intSeq[i] == 0)
                zeroElemIndicesList.add(i);
        zeroElemIndices = zeroElemIndicesList.toArray(new Integer[0]);

        System.out.println("Zero elements count: " + zeroElemIndices.length);
        System.out.print("Indices: ");
        for (Integer elem: zeroElemIndices)
            System.out.print(elem + " ");
        System.out.println("");
    }
}
