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
*让我更详细地解释一下这行代码。

首先，创建一个集合(set)意味着我们要存储一些数据并允许查询这些数据。通常，集合可以用来表示不同的数学概念，例如集合论、数组、列表和队列等等。在Java中，集合是一个非常常见和重要的数据结构。

在这行代码中，我们使用了Java中的Set和HashSet类来创建一个集合(set)。其中，Set是Java中的一个接口，它扩展了Java中的Collection接口，为存储元素提供了一些额外的方法。Set的一个特征是，它不允许包含重复的元素。这一点非常重要，因为在一些场景中，我们只需存储独特的元素，而不需要重复的元素。

而HashSet是Set的一种实现，它使用哈希表(hashing)来实现集合。哈希表是一个基于数组实现的数据结构，它允许快速的插入、删除和查询操作。如此快速的操作是因为哈希表使用了一个哈希函数，将元素的键值(key)映射到数组的某个位置上。因此，在具有良好哈希函数的情况下，哈希表可以实现O(1)时间复杂度的插入、删除和查询操作。

最后，为了限制Set中存储的元素类型，我们使用了Java中的泛型(generics)概念。具体来说，我们指定了Set实例化时的类型参数(Integer)，以确保这个集合只能存储整型(Integer)类型的元素。

综上所述，这行代码的作用是创建一个空的HashSet<Integer>集合(set)，它使用哈希表来存储不重复的整型元素，以便我们执行快速的插入、删除和查询操作。
* */