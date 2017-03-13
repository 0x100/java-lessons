package ru.tn.courses.mryabykh.task1.v3.subtask2;

import ru.tn.courses.mryabykh.utils.ArrayUtils;

import java.util.Arrays;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 */

public class Main {

    private static final int LOCK_SIZE = 10;
    private static final int CUBE_EDGES_COUNT = 6;
    private static final int UNLOCK_SEQUENCE_SUM = 10;
    private static final int COUNT_ELEMS_FOR_UNLOCK = 3;

    /**
     * Ищет кодовую послеовательность на основе массива ячеек с двумя вставленными кубиками
     *
     * @param cells - исходный массив ячеек(со вставленными двумя кубиками)
     * @return массив цифр, составляющих кодовую последовательность
     */
    private static int[] findOpenCode(int[] cells) {
        int[] code = new int[COUNT_ELEMS_FOR_UNLOCK];
        int sum = 0;
        int index = 0;
        for (int cell : cells) {
            if (cell != 0) {
                code[index] = cell;
                sum += cell;
                index++;
            }
        }
        code[index] = UNLOCK_SEQUENCE_SUM - sum;
        return code;
    }

    /**
     * Ищет позицию первого вставленного кубика
     *
     * @param cells - исходный массив ячеек (со вставленными двумя кубиками)
     * @return позиция первого вставленного кубика в массиве ячеек
     */
    private static int getFirstCubePosition(int[] cells) {
        int position = -1;
        for (int i = 0; i < cells.length; i++) {
            if (cells[i] != 0) {
                position = i;
                break;
            }
        }
        return position;
    }

    /**
     * Проверяет кодовую последовательность на корректность:
     * сумма элементов должна быть ровна 10 и нулевые элементы отсутствуют
     *
     * @param code - массив с цифрами, составляющими кодовую последовательность
     * @return корректна ли кодовая последовательность?
     */
    private static boolean isCorrectOpenCode(int[] code) {
        for (int item : code) {
            if (item == 0 || item < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Проверяет, разблокирован ли замок:
     * сумма значений каждых трех соседних ячеек равна 10 и все ячейки заполнены
     *
     * @param cells - массив заполненных ячеек замка
     * @return разблокирован ли замок?
     */
    private static boolean isUnlocked(int[] cells) {
        boolean isSuccess = true;
        for (int i = 0; i < cells.length - 2; i++) {
            if (cells[i] != 0) {
                if (cells[i] + cells[i + 1] + cells[i + 2] != UNLOCK_SEQUENCE_SUM) {
                    isSuccess = false;
                    break;
                }
            }
        }
        return isSuccess;
    }

    public static void main(String[] args) {

        int[] cells = new int[LOCK_SIZE];
        boolean isSuccess = false;

        // Пока не удалось открыть замок
        while (!isSuccess) {

            // Обнуляем массив ячеек замка и вставляем в него два случайных значения в разные ячейки
            Arrays.fill(cells, 0);
            int indexOne = (int) (Math.random() * LOCK_SIZE);
            int indexTwo = (int) (Math.random() * LOCK_SIZE);
            while (indexTwo == indexOne) {
                indexTwo = (int) (Math.random() * LOCK_SIZE);
            }
            cells[indexOne] = (int) (Math.random() * CUBE_EDGES_COUNT) + 1;
            cells[indexTwo] = (int) (Math.random() * CUBE_EDGES_COUNT) + 1;
            ArrayUtils.printArray(cells, "Исходный массив ячеек:");

            // Ищем кодовую последовательность
            int[] code = findOpenCode(cells);

            // Если кодовая последовательность корректна, заполняем массив ячеек
            if (isCorrectOpenCode(code)) {
                ArrayUtils.printArray(code, "Цифры кода:");

                // Ищем кодовую последовательность и позицию первого вставленного значения (кубика)
                int position = getFirstCubePosition(cells);

                // Если позиция первого вставленного значения (кубика) найдена, то заполняем массив.
                // Сначала идём от первого вставленного значения (кубика) до конца массива,
                // а затем от следующего от этого же значения (кубика) до начала массива.
                // Таким образом все ячейки замка заполняются должным образом.
                if (position != -1) {
                    for (int i = position; i < LOCK_SIZE - 2; i++) {
                        if (cells[i] != 0 && cells[i + 1] != 0 && cells[i + 2] != 0) {
                            continue;
                        } else if (cells[i + 1] != 0) {
                            cells[i + 2] = UNLOCK_SEQUENCE_SUM - cells[i] - cells[i + 1];
                        } else if (cells[i + 2] != 0) {
                            cells[i + 1] = UNLOCK_SEQUENCE_SUM - cells[i] - cells[i + 2];
                        } else {
                            cells[i + 1] = code[1];
                            cells[i + 2] = code[2];
                        }
                    }
                    for (int j = position + 1; j > 1; j--) {
                        if (cells[j] != 0 && cells[j - 1] != 0 && cells[j - 2] != 0) {
                            continue;
                        } else if (cells[j - 1] != 0) {
                            cells[j - 2] = UNLOCK_SEQUENCE_SUM - cells[j] - cells[j - 1];
                        } else if (cells[j - 2] != 0) {
                            cells[j - 1] = UNLOCK_SEQUENCE_SUM - cells[j] - cells[j - 2];
                        } else {
                            cells[j - 1] = code[1];
                            cells[j - 2] = code[2];
                        }
                    }
                } else { // Если позиция первого кубика не найдена, значит он не встален, делаем всё заново
                    continue;
                }
            }

            isSuccess = isUnlocked(cells);
        }

        ArrayUtils.printArray(cells, "Результирующий массив ячеек:");
    }
}
