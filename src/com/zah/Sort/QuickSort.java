package com.zah.Sort;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4, 5,6,0};
//        sort(arr, 0, arr.length-1);
        quickSort(arr, 0, arr.length - 1);
        System.out.println();
    }

    public static void sort(int a[], int low, int hight) {
        int l, r, index;
        if (low > hight) {
            return;
        }
        l = low;
        r = hight;
        index = a[l]; // 用子表的第一个记录做基准
        while (l < r) { // 从表的两端交替向中间扫描
            while (l < r && a[r] >= index)
                r--;
            if (l < r)
                a[l++] = a[r];// 用比基准小的记录替换低位记录
            while (l < r && a[l] < index)
                l++;
            if (l < r) // 用比基准大的记录替换高位记录
                a[r--] = a[l];
        }
        a[l] = index;// 将基准数值替换回 a[i]
        sort(a, low, l - 1); // 对低子表进行递归排序
        sort(a, l + 1, hight); // 对高子表进行递归排序
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int l = left;
            int r = right;
            int index = arr[l];
            while (l < r) {
                while (l < r && arr[r] > index) {
                    r--;
                }
                if (l < r) {
                    arr[l++] = arr[r];
                }
                while (l < r && arr[l] <= index) {
                    l++;
                }
                if (l < r) {
                    arr[r--] = arr[l];
                }
            }
            arr[l]=index;
            quickSort(arr, left, l-1);
            quickSort(arr, l+1, right);
        }
    }

}
