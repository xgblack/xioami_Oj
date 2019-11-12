package cn.xgblack.leetcode.l0657robot_return_to_origin;

/**
 * @author 小光
 * @date 2019/11/12 15:40
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0,y = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') {
               x--;
            } else if (moves.charAt(i) == 'R') {
                x++;
            } else if (moves.charAt(i) == 'U') {
                y++;
            } else if (moves.charAt(i) == 'D') {
                y--;
            }
        }
        if (x == 0 && y == 0) {
            return true;
        }
        return false;
    }
}
