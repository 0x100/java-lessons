package ru.tn.courses.ntseytlina.task1.v2.subtask2;

public class Main {
    public static void main (String [] args) {
        BanksList banksList = new BanksList();
        banksList.generateBanks(5);
        System.out.println(banksList);
        System.out.println("The best course bank:");
        System.out.println(banksList.getBestCourseBank());
    }
}
