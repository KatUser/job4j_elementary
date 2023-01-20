package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean nameIs = false;
        if (!name.isEmpty()) {
            int[] numbers = new int[name.length()];
            for (int i = 0; i < name.length(); i++) {
                int code = name.codePointAt(i);
                numbers[i] = code;
                if (!isLowerLatinLetter(numbers[0])) {
                    break;
                }
                for (int index = 1; index < numbers.length; index++) {
                    if (isUpperLatinLetter(numbers[index])
                            || isLowerLatinLetter(numbers[index])
                            || isSpecialSymbol(numbers[index])
                            || Character.isDigit(numbers[index])) {
                        nameIs = true;
                    }

                }
            }
        }
        return nameIs;
    }

    public static boolean isSpecialSymbol(int code) {
        return ((code == 36) || (code == 95));
    }

    public static boolean isUpperLatinLetter(int code) {
        return ((code >= 65) && (code <= 90));
    }

    public static boolean isLowerLatinLetter(int code) {
        return ((code >= 97) && (code <= 122));
    }
}