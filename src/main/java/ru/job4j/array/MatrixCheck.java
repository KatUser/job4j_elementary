package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int c = 0; c < board[row].length; c++) {
            if (board[row][c] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}