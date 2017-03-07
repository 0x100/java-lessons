/**
 * Created by Коба on 03.03.2017.
 * Вариант 5.
 * Сортировка Шелла. Дан массив n действительных чисел.
 * Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента ai и аi+1.
 * Если ai ≤ ai+1, то продвигаются на один элемент вперед.
 * Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 */
public class Main {

    private double[] setArray (int size) {
        int from = 0;
        int to = 50;
        double round = 10.0;
        double [] arr = new double [size];
        for (int i = 0; i < size; i++) {
            arr[i] = Math.rint(round * (from + Math.random() * to)) / round;
        }
        return arr;
    }

    private void printArr (double [] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " | ");
        System.out.println();
    }

    private double [] shellSortUp (double[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] <= arr[i + 1]) i++;
            else {
                double a = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = a;
                if (i > 0) i--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        Main obj = new Main();
        int SIZE = 25;

        double [] origArr = obj.setArray(SIZE);
        System.out.println("Original array:");
        obj.printArr(origArr);

        double [] sortArr = obj.shellSortUp(origArr);
        System.out.println("Sorted array:");
        obj.printArr(sortArr);
    }

}
