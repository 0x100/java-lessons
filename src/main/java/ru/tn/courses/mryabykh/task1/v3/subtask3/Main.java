package ru.tn.courses.mryabykh.task1.v3.subtask3;

import ru.tn.courses.mryabykh.utils.ArrayUtils;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 */

public class Main {

    private static class BubbleArray {
        private int swapsCount;
        private int[] numbers;

        private BubbleArray(int[] numbers) {
            this.numbers = numbers;
            bubbleSort();
        }

        private void bubbleSort() {
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = 0; j < numbers.length - 1; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                        swapsCount++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] sequence = ArrayUtils.fillRandomIntArray();
        ArrayUtils.printArray(sequence, "Исходная последовательность:");
        BubbleArray array = new BubbleArray(sequence);
        ArrayUtils.printArray(array.numbers, "Отсортированная последовательность:");
        System.out.println("Количество перестановок: " + array.swapsCount);
    }
}

