package com.zah;

import java.util.Arrays;

//给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
public class MaximumProduct {
    public int maximumProduct(int[] nums) {
        if (nums.length<=2 ) return -1;
        Arrays.sort(nums);
        return Math.max(Math.max(nums[0]*nums[1]*nums[nums.length-1],nums[0]*nums[nums.length-1]*nums[nums.length-2]),nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
    }
}
