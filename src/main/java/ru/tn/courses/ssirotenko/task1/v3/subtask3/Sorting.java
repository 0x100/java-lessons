package ru.tn.courses.ssirotenko.task1.v3.subtask3;

public class Sorting {
    private int[] array;

    Sorting(int[] array) {
        this.array = array;
    }

    public int[] exchangeSort() {
        int[] resultArray = array;
        int shift = 0;

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = resultArray.length - 1; j > i; j--) {
                if (resultArray[j] < resultArray[j - 1]) {
                    int temp = resultArray[j];
                    resultArray[j] = resultArray[j - 1];
                    resultArray[j - 1] = temp;
                    shift += 1;
                }
            }
        }

        System.out.println();
        System.out.println("Перестановок: " + shift);
        return resultArray;
    }
}
