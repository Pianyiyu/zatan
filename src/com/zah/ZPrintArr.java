package com.zah;

public class ZPrintArr {

    public static void main(String[] args) {
        新增
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8},{9,10,11,12}};
        zPrintArr(arr);
    }

    public static void zPrintArr(int[][] arr) {
        int r = arr.length - 1;
        int c = arr[0].length - 1;
        boolean flag = false;
        int ar = 0;
        int ac = 0;
        int br = 0;
        int bc = 0;
        while (bc<=c) {
            print(arr, flag, ar, ac, br, bc);
            if (ac<c) ac++;
            else ar++;
            if (br<r) br++;
            else bc++;
            flag=!flag;
        }
    }

    public static void print(int[][] arr, boolean flag, int ar, int ac, int br, int bc) {
        if (!flag) {
            while (ar <= br && ac >= bc) {
                System.out.println(arr[ar][ac]);
                ar++;
                ac--;
            }
        } else {
            while (ar <= br && ac >= bc) {
                System.out.println(arr[br][bc]);
                br--;
                bc++;
            }
        }
    }
}
