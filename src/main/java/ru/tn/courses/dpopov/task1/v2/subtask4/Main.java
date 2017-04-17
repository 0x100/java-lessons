package ru.tn.courses.dpopov.task1.v2.subtask4;
import com.sun.org.apache.xpath.internal.SourceTree;
import sun.plugin2.util.SystemUtil;

import java.util.Scanner;
/**
 * Created by P.S.InDIGO on 19.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вводите символы");
        String m;
        m = scan.nextLine();
        char[] array = m.toCharArray();

        for(int i = 0; i < array.length; i++ ){
            System.out.print(array[i]+" ");
        }

        int el;
        int check = 0;
        int count = 0;
        int thisCheck = 0;
        int razmer = 0;
        String podstoka = "";

        for(int q = 2; q < (array.length-1); q++){
            for(int w = 0; w <= (array.length-q); w++){
                for(int e = 0; e <= (array.length-q); e++) {
                    el = 0;
                    for (int i = w; i < (w + q); i++) {
                        if (array[i] == array[e+el]){
                            check ++;
                        }
                        el++;
                    }
                    if(check == q){
                        thisCheck++;
                    }
                    check = 0;
                }

                if((count < thisCheck )|| (razmer < q && count == thisCheck)){
                    count = thisCheck;
                    razmer = q;
                    podstoka ="";
                    for(int i = w; i < (w + q); i++){
                        podstoka = (podstoka + array[i]);

                    }
                }
                thisCheck = 0;
            }
        }
        System.out.println();
        System.out.println("Подстрока --> "+podstoka);
        System.out.println("Размер подстроки --> "+razmer);
        System.out.println("Количество повторений --> "+count);

    }
}
