package com.sort.testapp;

public class RotateArray_189 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        reserve(nums, 0, nums.length - 1);
        reserve(nums,0, k - 1);
        reserve(nums, k, nums.length - 1);
    }
    public void reserve(int[] nums, int start, int end){

        while (start < end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
