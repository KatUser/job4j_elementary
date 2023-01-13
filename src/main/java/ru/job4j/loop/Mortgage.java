package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = percent / 100 * amount + amount - salary;
            amount *= percent / 100;
            year += 1;
        }
        return year;
    }
}