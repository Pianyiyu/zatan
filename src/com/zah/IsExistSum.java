package com.zah;


public class IsExistSum {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        int target = 16;
        System.out.println(isExist(arr, target,0,0));
        System.out.println(isExist2(arr, target));
    }

    private static boolean isExist(int[] arr, int target,int res,int index) {
        if (res == target){
            return true;
        }
        if (index >= arr.length){
            return false;
        }
        return isExist(arr,target,res+arr[index],index+1) || isExist(arr,target,res,index+1);
    }

    private static boolean isExist2(int[] arr, int target){
        boolean[][] dp = new boolean[arr.length][target+1];
        for (int i = 0; i <= target; i++) {
            if (arr[0] == i) dp[0][i] = true;
        }
        for (int i = 0; i < arr.length; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= target ; j++) {
                if (arr[i] > j) dp[i][j] = false;
                else
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i]];
            }
        }
        return dp[arr.length-1][target];
    }
}
