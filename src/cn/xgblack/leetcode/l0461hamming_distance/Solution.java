package cn.xgblack.leetcode.l0461hamming_distance;

/**
 * @author 小光
 * @date 2019/11/9 21:06
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int res = 0;
        String xs = Integer.toBinaryString(x);
        String ys = Integer.toBinaryString(y);
        if (xs.length() < ys.length()) {
            String temp = xs;
            xs = ys;
            ys = temp;
        }
        for (int i = xs.length() - 1; i >= 0; i--) {
            if (i >= xs.length() - ys.length()) {
                if (xs.charAt(i) != ys.charAt(i + ys.length() - xs.length())) {
                    res++;
                }
            } else {
                if (xs.charAt(i) != '0') {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingDistance(1, 4));
    }
}
