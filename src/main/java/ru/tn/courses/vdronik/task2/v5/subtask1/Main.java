package main.java.ru.tn.courses.vdronik.task2.v5.subtask1;


import java.util.ArrayList;
import java.util.List;


public class Main {
    static List<Board> Boardh = new ArrayList<Board>();
    static List<Nail> Nailh = new ArrayList<Nail>();
    static int N = 5;
    static int A = 100;
    static int B = 100;
    static int Cn = A / 5;
    static int Dn = B / 5;

    static void showNail(){
        for (int i = 0; i < Nailh.size(); i++){
            System.out.println("Гвоздь " + (i + 1)+ " (" + Nailh.get(i).x + "," + Nailh.get(i).y + ")");
        }
        System.out.println("\n Всего гвоздей: " + Nailh.size());
    }

    static void showBoard(){
        for(int i = 0; i < Boardh.size(); i++){
            System.out.println("Объявление " + (i + 1) + " (" + Boardh.get(i).left +"," +Boardh.get(i).top +"," +Boardh.get(i).right +"," +Boardh.get(i).bottom+ ")");
        }
        System.out.println();
    }

    public static void main(String[] args){

        int left = 0;
        int right = Cn;
        int top = 0;
        int bottom = Dn;

        int nailX1 = 2;
        int previousNailX1 = nailX1;

        int nailY1 = 2;

        while(bottom <= B){
            while(right <= A){
                N--;

                Boardh.add(new Board(left,right,top,bottom));

                if (!Nailh.contains(new Nail(nailX1,nailY1))){
                    Nailh.add(new Nail(nailX1,nailY1));
                }

                left += Cn - 3;
                right = left + Cn;

                previousNailX1 = nailX1;
                nailX1 = left + 1;

                if (!Nailh.contains(new Nail(previousNailX1 ,nailY1 + Dn))){
                    Nailh.add(new Nail(previousNailX1 ,nailY1 + Dn));
                }

                if (N == 0){
                    showBoard();
                    showNail();
                    return;
                }

            }
            top += Dn;
            bottom += Dn;
            nailY1 = nailY1 + Dn ;
            left = 0;
            right = Cn;
            nailX1 = 2;
        }

        System.out.println("Ошибка");

    }
}
