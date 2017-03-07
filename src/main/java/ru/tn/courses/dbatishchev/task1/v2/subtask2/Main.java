package ru.tn.courses.dbatishchev.task1.v2.subtask2;

import java.util.Random;

/**
 * Created by ii343hbka on 01/03/2017.
 */
public class Main {
    class Bank {
        private String name;
        private double conversRate;

        private int currencyLB = 59; // not inclusive
        private int currencyUB = 61; // not inclusive

        private Bank(String name) {
            this.name = name;
            this.conversRate = this.currencyLB + (new Random().nextDouble() * (this.currencyUB - this.currencyLB));
        }
    }

    private Bank[] banks = {
            new Bank("sber"),
            new Bank("vtb24"),
            new Bank("sovkom"),
            new Bank("pochaBank"),
            new Bank("gazpromBank")
    };

    public static void main(String[] args) {
        System.out.println("trying to guess the best bank for USDtoRUR conversion");

        Bank[] banks = new Main().banks;
        double bestConversRate = banks[0].conversRate;
        String bestBankName = banks[0].name;
        for (int i = 1; i < banks.length; i++) {
            Bank bank = banks[i];
            if (bank.conversRate > bestConversRate) {
                System.out.println("bank \"" + bank.name + "\" win over " + bestBankName + ". Greeting the new best bank");
                bestConversRate = bank.conversRate;
                bestBankName = bank.name;
            }
            else
                System.out.println("bank \"" + bank.name + "\" worth than \"" + bestBankName + "\". Skipping...");
        }
        System.out.println("\n" +
                "Best bank: \"" + bestBankName + "\", conversRate: " + bestConversRate);
    }
}
