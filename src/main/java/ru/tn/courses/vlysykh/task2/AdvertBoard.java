package ru.tn.courses.vlysykh.task2;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * Created by ElemenT87 on 25.03.2017.
 */
 class AdvertBoard {
    private static Integer sideA;
    private static Integer sideB;
    private ArrayList<Advert> advertList;
    private LinkedHashSet<Nail> nails;

     public AdvertBoard() {
        ArrayList<Advert> advertList = new ArrayList<>();
        LinkedHashSet<Nail> nails = new LinkedHashSet<>();
        this.sideA = 100;
        this.sideB = 100;
        this.nails=nails;
        this.advertList = advertList;
    }

    AdvertBoard(int A, int B) {
        if (isGoodBoardSize(A, B)) {
            ArrayList<Advert> advertList = new ArrayList<>();
            LinkedHashSet<Nail> nails = new LinkedHashSet<>();
            this.sideA = A;
            this.sideB = B;
            this.advertList = advertList;
            this.nails=nails;
        } else {
            throw new IllegalArgumentException("It's a bad size!@@x##@!!");
        }
    }

    boolean isGoodBoardSize(int A, int B) {
        return A >= 100 && B >= 100;
    }

    public void addAdvert(Integer count) {
        if (count>=5) {
           for (int advertCount=1; advertCount<=count;advertCount++) {
                Advert advert = new Advert();
                Integer lastIndex = advertList.size() - 1;
                if (advertList.isEmpty()) {
                    addFistAdvert(advert);
                } else {
                    addNextAdvert(advert, lastIndex);
                }
            }
            printAdvert();
            printNail();
        } else {
            throw new IllegalArgumentException("Too few adverts");
        }
    }
    void addFistAdvert(Advert advert) {
        advert.left = 1;
        advert.top = 1;
        advert.right = (AdvertBoard.sideB - advert.sideD) - 1;
        advert.bottom = (AdvertBoard.sideA - advert.sideC) - 1;
        this.advertList.add(advert);
        addNails(advert);
    }

     void addNextAdvert(Advert advert, Integer lastIndex){
        Integer leftShift, rightShift, topShift, bottomShift;
        leftShift = rightShift = advert.sideD - 3;
        topShift = bottomShift = 0;


        if (isNotTouchRightSide(lastIndex)) {
            advert.left = advertList.get(lastIndex).left + leftShift;
            advert.top = advertList.get(lastIndex).top + topShift;
            advert.right = advertList.get(lastIndex).right - rightShift;
            advert.bottom = advertList.get(lastIndex).bottom + bottomShift;
            this.advertList.add(advert);
            addNails(advert);
        } else if (isNotTouchBottomSide(lastIndex)) {
            topShift = bottomShift = (advertList.get(lastIndex).sideC)-3;
            advert.left = 1;
            advert.top = advertList.get(lastIndex).top + topShift;
            advert.right = (AdvertBoard.sideB - advert.sideD) - 1;
            advert.bottom = advertList.get(lastIndex).bottom - bottomShift;
            this.advertList.add(advert);
            addNails(advert);
        } else {
            throw new IllegalArgumentException("Out of a board Exception!!!!");
        }
    }

     boolean isNotTouchRightSide (Integer lastIndex) {
        return ((advertList.get(lastIndex).right) - (advertList.get(lastIndex).sideD-3))>0;
    }

     boolean isNotTouchBottomSide (Integer lastIndex) {
        return ((advertList.get(lastIndex).bottom) - (advertList.get(lastIndex).sideC-3))>0;
    }

     void printAdvert() {
        System.out.println("Quantity of adverts: " + advertList.size());
        System.out.println("Coordinates of adverts:  ");
        int index = 1;
        for (Advert advert1 : advertList) {
            System.out.println("left"+(index)+": ("+advert1.left + ")     right"+(index)+": (" + advert1.right + ")     top"+(index)+ ": ("+ advert1.top + ")     bottom"+(index++)+": (" + advert1.bottom+")");
        }
        System.out.println();
    }

     void addNails(Advert advert) {
        Integer x1,x2,x3,x4,y1,y2,y3,y4;
        x1 = advert.left+2;
        y1 = advert.top+2;
        x2 = (AdvertBoard.sideB-advert.right)-1;
        y2 = advert.top+2;
        x3 = advert.left+2;
        y3 = (AdvertBoard.sideA-advert.bottom)-1;
        x4 = (AdvertBoard.sideB-advert.right)-1;
        y4 = (AdvertBoard.sideA-advert.bottom)-1;
        nails.add(new Nail(x1,y1));
        nails.add(new Nail(x2,y2));
        nails.add(new Nail(x3,y3));
        nails.add(new Nail(x4,y4));
    }

     void printNail() {
        System.out.println("Quantity of nails: " + nails.size());
        System.out.println("Coordinates of nails:   (x,y)");
        int index = 1;
        for (Nail nail : nails) {
            System.out.println("x"+(index)+"("+nail.x + ")  y"+(index++)+"(" + nail.y+")");
        }
    }

     class Advert {
        private Integer left, right, top, bottom;
        private Integer sideC, sideD;

         Advert() {
            this.sideC = sideA / 5;
            this.sideD = sideB / 5;
        }

         Advert(int C, int D) {
            if (isGoodAdvertSize(C, D)) {
                this.sideC = C;
                this.sideD = D;
            } else {
                throw new IllegalArgumentException("It's a bad size!@@x##@!!");
            }
        }

        boolean isGoodAdvertSize(int C, int D) {
            return C <= sideA / 5 && D <= sideB / 5;
        }
    }

     class Nail{
        private Integer x,y;

        public Nail(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Nail nail = (Nail) o;

            if (x != null ? !x.equals(nail.x) : nail.x != null) return false;
            return y != null ? y.equals(nail.y) : nail.y == null;
        }

        @Override
        public int hashCode() {
            int result = x != null ? x.hashCode() : 0;
            result = 31 * result + (y != null ? y.hashCode() : 0);
            return result;
        }
    }
}

