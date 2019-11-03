package cn.xgblack.leetcode.lLCP1guess_numbers;

/**
 * @author 小光
 * @date 2019/11/3 21:25
 * className: Solution
 * description: 小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，
 *              小A 每次也从 1, 2, 3 中选择一个猜。他们一共进行三次这个游戏，
 *              请返回 小A 猜对了几次？
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution {
    public int game(int[] guess, int[] answer) {
        int num = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                num++;
            }
        }
        return num;
    }
}
