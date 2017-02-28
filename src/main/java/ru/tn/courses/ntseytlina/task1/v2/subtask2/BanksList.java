package ru.tn.courses.ntseytlina.task1.v2.subtask2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BanksList {
    List<Bank> banksList;

    public BanksList () {
        banksList = new ArrayList<>();
    }

    public void generateBanks (int size) {
        for (int i = 0; i < size; i++) {
            banksList.add(new Bank("Bank " + i, Math.random() * 100));
        }
    }

    public Bank getBestCourseBank () {
        Bank bestBank = banksList.get(0);
        for (Bank bank : banksList) {
            if (bank.getCourse() < bestBank.getCourse()) {
                bestBank = bank;
            }
        }
        return bestBank;
    }

    @Override
    public String toString() {
        String str = "Banks: [ ";
        Iterator<Bank> iterator = banksList.iterator();
        while (iterator.hasNext()) {
            str += iterator.next();
            if (iterator.hasNext()) {
                str += ",\n";
            }
        }
        str += " ]";

        return str;
    }
}
