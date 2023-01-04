package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double p = 4;
        double k = 1;
        double result1 = SqArea.square(p, k);
        System.out.println("p = " + p + ", "  + "k = " + k + ", " + "s = " + square(p, k) + ", " + "real" + " = " + result1);
    }
}