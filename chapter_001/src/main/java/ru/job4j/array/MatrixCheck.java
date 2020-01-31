package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;

        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'X' && monoHorizontal(board, i)) {
                result = true;
                break;
            }

            if (board[0][i] == 'X' && monoVertical(board, i)) {
                result = true;
                break;
            }
        }

        return result;
    }

    private static boolean monoVertical(char[][] board, int column) {
        boolean result = true;

        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }

        return result;
    }

    private static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;

        for (int column = 0; column < board.length; column++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }

        return result;
    }
}
