package com.zah.Sort;

import sun.nio.ch.ThreadPool;

import java.util.HashMap;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;

public class HeapSort {
    public static void main(String[] args) {
//        int[] arr = {3, 1, 2, 4, 5, 6, 0};
//        int[] arr = {4, 10, 3, 5, 1, 2};
        int[] arr = {2, 5, 3, 1, 10, 4};
//        sort(arr, 0, arr.length-1);
        sort(arr, arr.length);
//        build(arr,arr.length);
//        heapfy(arr,arr.length,0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        CountDownLatch;
//        CyclicBarrier
//        Future;
//        Lock;
//        StringBuffer;
//        ThreadLocal;
//        Thread;
//        HashMap;
//        ConcurrentHashMap
        String s1 = "a";
        String s2 = "b";
        System.out.println(s1 == s2);

        Integer a = 1;
        Integer b = 1;
        Integer c = new Integer(1);
        Integer d = new Integer(1);
        System.out.println(a == b);
    }
    public static void sort(int[] arr ,int n){
        build(arr,n);
        for (int i = n-1; i > 0 ; i--) {
            swap(arr,i,0);
            heapfy(arr,i,0);
        }
    }

    public static void  build(int[] arr, int n){
        int lastnode = n - 1;
        int parent = (lastnode - 1 )/2;
        for (int i = parent; i >= 0 ; i--) {
            heapfy(arr,n,i);
        }
    }

    public static void heapfy(int[] arr,int n, int i){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if ( i >= n )
            return;
        int max = i;
        if (left < n && arr[left] > arr[max]){
            max = left;
        }
        if (right < n && arr[right] > arr[max]){
            max = right;
        }
        if (max != i ){
            swap( arr ,max,i);
            heapfy(arr,n,max);
        }
    }

    private static void swap(int[] arr, int left, int i) {
        int temp = arr[i];
        arr[i] = arr[left];
        arr[left] = temp;
    }

}
