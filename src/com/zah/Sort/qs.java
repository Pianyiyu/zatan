package com.zah.Sort;

public class qs {
    public static void main(String[] args) {
        int[] arr = {2,4,6,1,3};
        quicksort(arr,0,arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void  quicksort(int[] arr , int left ,int right){
        if (left < right){
            int l = left;
            int r = right;
            int state = arr[left];
            while (l < r){
                while (l < r && arr[r] >= state){
                    r--;
                }
                if (l < r){
                    arr[l] = arr[r];
                }
                while (l < r && arr[l] < state){
                    l++;
                }
                if (l < r){
                    arr[r] = arr[l];
                }
            }
            arr[l] = state;
            quicksort(arr, left, l - 1);
            quicksort(arr, l + 1, right);

        }
    }
}
