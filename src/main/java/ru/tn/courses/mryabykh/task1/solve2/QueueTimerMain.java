package ru.tn.courses.mryabykh.task1.solve2;

import java.util.Arrays;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 * Variant: 1
 */

public class QueueTimerMain {

    /**
     * Определяет время пребывания каждого i-го покупателя в очереди
     * @param n - количество покупателей
     * @param serviceTimes - массив со временем обслуживания каждого i-го покупателя
     * @return - массив со временем пребывания каждого i-го покупателя в очереди
     */
    private static int[] getTimesInQueue(int n, int[] serviceTimes) {
        int[] timesInQueue = new int[n];
        timesInQueue[0] = serviceTimes[0];

        for (int i = 1; i < n; i++) {
            timesInQueue[i] = timesInQueue[i-1] + serviceTimes[i];
        }

        return timesInQueue;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] times = {3, 2, 10, 1, 5, 3, 7, 5, 5, 2};
        System.out.println(Arrays.toString(getTimesInQueue(n, times)));
    }
}
