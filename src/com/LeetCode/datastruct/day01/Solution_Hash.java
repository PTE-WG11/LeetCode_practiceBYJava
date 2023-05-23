package com.LeetCode.datastruct.day01;

import java.util.HashSet;
import java.util.Set;

public class Solution_Hash {
    public boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<Integer>();
        for (int x:nums){
            if(!set.add(x))
                // 把元素添加进哈希表
                return true;
        }
        return false;
    }
}
/*
*
*
* */