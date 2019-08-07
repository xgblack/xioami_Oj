package cn.xgblack.leetcode.l0001add;

/**
 * @author 小光
 * @date 2019/7/27 16:38
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0;i < nums.length - 1;i++){
            for(int j = i + 1;j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    int[] res = new int[2];
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return null;
    }
}


