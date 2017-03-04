package ru.tn.courses.dbatishchev.task1.v2.subtask1;

import ru.tn.courses.dbatishchev.task1.v2.Aux;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ii343hbka on 01/03/2017.
 */
public class Main {

    private static final long seqSize = 100;
    private static final int seqLowBound = 0;
    private static final int seqUpperBound = 10;

    public static void main(String[] args) {
        int[] intSeq = Aux.randomIntSequence(seqSize, seqLowBound, seqUpperBound);
        int[] zeroElemIndices = new int[intSeq.length];

        int zIdx = 0;
        for(int i = 0; i < intSeq.length; i++)
            if(intSeq[i] == 0)
                zeroElemIndices[zIdx++] = i;
        zeroElemIndices = Arrays.copyOfRange(zeroElemIndices, 0, zIdx);

        System.out.println("Zero elements count: " + zeroElemIndices.length);
        System.out.print("Indices: ");
        for (Integer elem: zeroElemIndices)
            System.out.print(elem + " ");
        System.out.println("");
    }
}
