package ru.tn.courses.ptihomirov.task1.v1.subtask3;

import java.util.Arrays;

/**
 * Created by Павел on 12.03.2017.
 */
public class Main2
{
    public static void main(String args[])
    {
        int n = 3;
        int Arr_a[] = {1,2,3};
        int Arr_b[] = {4,5,6};
        int Arr_res[] = new int[n*2];

        System.arraycopy(Arr_a,0, Arr_res, 0, Arr_a.length);
        System.arraycopy(Arr_b,0, Arr_res, Arr_a.length, Arr_b.length);
        Arrays.sort(Arr_res);

        System.out.println(Arrays.toString(Arr_res));
    }
}
