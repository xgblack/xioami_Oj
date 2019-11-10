package cn.xgblack.leetcode.l0832flipping_an_image;

/**
 * @author 小光
 * @date 2019/11/10 20:28
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] res = new int[A.length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                A[i][j] = A[i][j] == 0 ? 1 : 0;
                res[i][A.length - j - 1] = A[i][j];
            }
        }
        return res;
    }
}
