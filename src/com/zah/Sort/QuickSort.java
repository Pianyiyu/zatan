package com.zah.Sort;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class QuickSort {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 3000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(100));
//        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//        for (int i = 0; i < arr.length; i++) {
//            threadPoolExecutor.execute(() -> {
//                System.out.println(Thread.currentThread().getName());
//                for (int j = 0; j < arr.length; j++) {
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(arr[j]+":"+Thread.currentThread().getName());
//                }
//            });
//        }

        int[] arr = {3, 1, 2, 4, 5,6,0};
//        sort(arr, 0, arr.length-1);
        qs(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
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
            arr[l] = index;
            quickSort(arr, left, l - 1);
            quickSort(arr, l + 1, right);
        }
    }

    private static void  qs(int[] arr, int left, int right){
        if (left<right){
            int l = left;
            int r = right;
            int s = arr[left];
            while (l < r){
                while (l < r && s <= arr[r]){
                    r--;
                }
                if (l < r){
                    arr[l] = arr[r];
                }
                while (l < r && s > arr[l]){
                    l++;
                }
                if (l < r){
                    arr[r] = arr[l];
                }
            }
            arr[l] = s;
            qs(arr , left ,l-1);
            qs(arr ,l + 1 ,right);
        }

    }

}
