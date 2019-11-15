package ru.tn.courses;

import java.util.Scanner; 

public class Example {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        String name = new Scanner(System.in).nextLine();        
        System.out.println("Hello, " + name);
    }
}
