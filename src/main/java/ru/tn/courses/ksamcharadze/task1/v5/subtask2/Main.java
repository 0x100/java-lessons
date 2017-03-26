package ru.tn.courses.ksamcharadze.task1.v5.subtask2;
/**
 * Created by Коба on 03.03.2017.
 * Вариант 5.
 * Каждый солнечный день улитка, сидящая на дереве, поднимается вверх на 2 см,
 * а каждый пасмурный день опускается вниз на 1 см,
 * В начале наблюдения улитка находится в A см от земли на B-метровом дереве.
 * Имеется 30-элементный массив, содержащий сведения о том,
 * был ли соответствующий день наблюдения пасмурным или солнечным.
 * Написать программу, определяющую местоположение улитки к концу 30-го дня наблюдения.
 */
import java.util.Random;
public class Main {

    private int SIZE = 30;
    private boolean [] days = new boolean[SIZE];
    private Main() {
        for (int i = 0; i < SIZE; i ++)
            days[i] = new Random().nextBoolean();
    }

    private void movement(int fromGround, int treeHeight) {
        int up = 2;
        int down = 1;
        for (int i = 0; i < SIZE; i++)
        {
            System.out.print("day " + (i + 1) + " - ");
            if (days[i]) {
                System.out.print("C: ");
                if (fromGround + up < treeHeight) {
                    System.out.println("move up from " + fromGround + " to " + (fromGround + up));
                    fromGround += up;
                }
                else { System.out.println("reached top of tree"); fromGround  = treeHeight; }
            }
            else {
                System.out.print("П: ");
                if (fromGround > 0) {
                    System.out.println("move down from " + fromGround + " to " + (fromGround - down));
                    fromGround -= down;
                }
                else { System.out.println("reached the bottom"); fromGround = 0; }
            }
        }
        System.out.println("position snail " + fromGround + " on tree height " + treeHeight);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.movement(1, 30);
    }

}
