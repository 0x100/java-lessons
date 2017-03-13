package ru.tn.courses.mryabykh.task1.v1.subtask2;

import ru.tn.courses.mryabykh.utils.ArrayUtils;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 */

public class Main {

    /**
     * Определяет время пребывания каждого i-го покупателя в очереди
     *
     * @param n            - количество покупателей
     * @param serviceTimes - массив со временем обслуживания каждого i-го покупателя
     * @return - массив со временем пребывания каждого i-го покупателя в очереди
     */
    private static int[] getTimesInQueue(int n, int[] serviceTimes) {
        int[] timesInQueue = new int[n];
        timesInQueue[0] = serviceTimes[0];

        for (int i = 1; i < n; i++) {
            timesInQueue[i] = timesInQueue[i - 1] + serviceTimes[i];
        }

        return timesInQueue;
    }

    public static void main(String[] args) {
        int[] times = ArrayUtils.fillRandomUintArray();
        ArrayUtils.printArray(times, "Исходный массив:");
        ArrayUtils.printArray(getTimesInQueue(times.length, times), "Массив времени нахождения в очереди:");
    }
}
