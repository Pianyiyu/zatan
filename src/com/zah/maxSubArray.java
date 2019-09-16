package com.zah;

//最大子序列之和
public class maxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));

    }
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int i : nums){
                if (sum > 0)
                    sum += i;
                else
                    sum = i;
                res = Math.max(res,sum);
        }
        return res;
    }
}
