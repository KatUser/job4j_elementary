package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inRuble = 120;
        float expectedDollar = 3;
        float outRuble = rubleToDollar(inRuble);
        boolean passedDollarTest = expectedDollar == outRuble;
        System.out.println("120 rubles are 2. Test result: " + passedDollarTest);
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar.");

    }
}