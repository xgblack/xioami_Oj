package cn.xgblack.leetcode.l0303range_sum_query_immutable;

/**
 * @author 小光
 * @date 2019/8/25 18:24
 * className: NumArray
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class NumArray2 {
    //sum[i]存储前i个元素和  sum[0]=0 sum[1]才是第一个元素的值
    private int[] sum;
    public NumArray2(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }

}
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */