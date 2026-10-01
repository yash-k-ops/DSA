package arrays;

/*
 * Problem: Find Target Indices After Sorting Array
 * Problem link: https://leetcode.com/problems/find-target-indices-after-sorting-array/
 * Platform: LeetCode
 * Difficulty: Easy
 * Author: Yash Khandelwal
 * Language: Java
 * Time Complexity: O(n log n)
 */

import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                l.add(i);
            }
        }

        return l;
    }
}