package com.zah;

public class Islands {

    public static void main(String[] args) {
        int[][] m1 = {{0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 0},
                {0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},};
        System.out.println(countIslands(m1));
        int[][] m2 = {{0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 0},
                {0, 1, 1, 0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},};
        System.out.println(countIslands(m2));
    }

    public static int countIslands(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int res = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 1) {
                    res += 1;
                    inflect(arr, row, col, i, j);
                }
            }
        }
        return res;
    }

    private static void inflect(int[][] arr, int row, int col, int i, int j) {
        if (i < 0 || i >= row || j < 0 || j >= col || arr[i][j] != 1) {
            return;
        }
        arr[i][j] = 2;
        inflect(arr, row, col, i + 1, j);
        inflect(arr, row, col, i - 1, j);
        inflect(arr, row, col, i, j + 1);
        inflect(arr, row, col, i, j - 1);
    }

}
