package ru.job4j.condition;
import  java.lang.Math;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        double c = 2;
        double rsl = TrgArea.area(a, b, c);
        System.out.println("area (" + a + ", " + b + ", " + c + ") = " + rsl);
    }
}