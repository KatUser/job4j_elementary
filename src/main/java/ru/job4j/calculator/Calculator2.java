package ru.job4j.calculator;
public class Calculator2 {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        Calculator2.plus(1, 2);
        Calculator2.plus(10, 11);
    }
}