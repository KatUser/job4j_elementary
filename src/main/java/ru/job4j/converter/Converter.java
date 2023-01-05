package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float dollar = rubleToDollar(120);
        float euro = rubleToEuro(140);
        System.out.println("120 rubles are " + dollar + " dollar.");
        System.out.println("140 rubles are " + euro + " euro.");
        float inRubleToDollar = 120;
        float inRubleToEuro = 140;
        float expectedEuro = 2;
        float expectedDollar = 2;
        float outRubleToDollar = rubleToDollar(inRubleToDollar);
        float outRubleToEuro = rubleToEuro(inRubleToEuro);
        boolean passedDollarTest = expectedDollar == outRubleToDollar;
        boolean passedEuroTest = expectedEuro == outRubleToEuro;
        System.out.println("120 rubles are 2 dollar. Test result: " + passedDollarTest);
        System.out.println("140 rubles are 2 euro. Test result: " + passedEuroTest);

    }
}