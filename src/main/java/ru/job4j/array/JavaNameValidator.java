package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean nameIs = !name.isEmpty() && isLowerLatinLetter(name.charAt(0));
        for (int i = 1; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (!isSpecialSymbol(code)
                    && !isUpperLatinLetter(code)
                    && !isLowerLatinLetter(code)
                    && !isNumber(code)) {
                nameIs = false;
                break;
            }
        }
        return nameIs;
    }

    public static boolean isSpecialSymbol(int code) {
        return ((code == 36) || (code == 95));
    }

    public static boolean isUpperLatinLetter(int code) {
        return Character.isUpperCase((char) code);
    }

    public static boolean isLowerLatinLetter(int code) {
        return Character.isLowerCase((char) code);
    }

    public static boolean isNumber(int code) {
        return Character.isDigit((char) code);
    }
}