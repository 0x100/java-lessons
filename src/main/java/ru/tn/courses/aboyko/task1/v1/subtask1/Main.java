import java.util.Arrays;
import java.util.Scanner;

public static void main(String[] args)

    {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = in.nextInt();
        int [] array = new int [size];
        for(int i = 0; i < size; i++) {
           array [i] = ((int)(Math.random() * 100) + 1 );
        }

        System.out.println("Сгенерирован массив: " + Arrays.toString(array));
        System.out.print("Введите необходимое число\n");
        int input = in.nextInt();

        for(int i = 0; i < size; i++){
            if(array[i] % input == 0) sum = array[i]+sum;
        }
        System.out.println("Сумма чисел кратных введенному:" + sum);
    }
