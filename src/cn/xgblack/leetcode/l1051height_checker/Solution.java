package cn.xgblack.leetcode.l1051height_checker;

/**
 * @author 小光
 * @date 2019/11/12 16:07
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution {
    public int heightChecker(int[] heights) {
        int res = 0;
        int[] arr = new int[101];

        for (int i = 0; i < heights.length; i++) {
            arr[heights[i]]++;
        }
        for (int i = 0,j = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                if (i != heights[j]) {
                    res++;
                }
                arr[i]--;
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        //int[] heights = {1, 1, 4, 2, 1, 3};
        int[] heights = {1, 2, 1, 2, 1, 1, 1, 2, 1};
        System.out.println(s.heightChecker(heights));
    }
}
