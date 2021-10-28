package dev.girishyt.leetcode.array;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,1,5};
        int[] nums1 = {1,2,3,4,6,5};
        System.out.println(containsDuplicateStreams(nums));
        System.out.println(containsDuplicateStreams(nums1));
    }
    /* Not accepted solution due to high time complexity */
    private static boolean containsDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* Execution Time - 5ms - Best Solution */
    private static boolean containsDuplicateHashset(int[] nums) {
        Set numSet = new HashSet();
        for(int num: nums) {
            numSet.add(num);
        }
        return nums.length != numSet.size();
    }

    /* Execution Time - 7ms - Second Best Solution */
    private static boolean containsDuplicateStreams(int[] nums) {
        return IntStream.of(nums).distinct().count() != nums.length;
    }
}
