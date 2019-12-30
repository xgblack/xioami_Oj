package cn.xgblack.leetcode.l0561array_partition_i;

import java.util.Arrays;

/**
 * @author xg BLACK
 * @date 2019/12/30 15:16
 * description:
 */
public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ret = 0;
        for (int i = 0; i < nums.length; i+=2) {
            ret += nums[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 4, 3, 2};
        System.out.println(s.arrayPairSum(nums));
    }
}
