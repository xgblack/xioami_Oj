package cn.xgblack.leetcode.l0771jewels_and_stones;

/**
 * @author 小光
 * @date 2019/11/3 21:30
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {
        int num = 0;
        char[] js = J.toCharArray();
        char[] ss = S.toCharArray();
        for (int i = 0; i < js.length; i++) {
            for (int j = 0; j < ss.length; j++) {
                if (js[i] == ss[j]) {
                    num++;
                }
            }
        }
        return num;
    }
}
