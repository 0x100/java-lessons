package ru.tn.courses.ntseytlina.task1.v2.subtask2;

public class Bank {
    private String name;
    private double course;

    public Bank(String name, double course) {
        this.name = name;
        this.course = course;
    }

    public double getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Bank: { " + name + ": " + course + " }";
    }
}
