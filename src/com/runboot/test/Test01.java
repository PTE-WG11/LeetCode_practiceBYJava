package com.runboot.test;

import com.LeetCode.datastruct.day01.Solution;

public class Test01 {
    public static void main(String[] args){
        int[] nums = new int[4];
         nums = new int[]{1, 2, 3, 1};
        Solution solution=new Solution();
        boolean re=solution.containsDuplicate(nums);

        System.out.print(String.valueOf(re));
    }
}
