package cn.xgblack.leetcode.l292nim_game;

/**
 * @author xgBLACK
 * @date 2019/11/18 9:29
 * description:
 */
public class Solution2 {
    public boolean canWinNim(int n) {
        if (n <= 3) {
            return true;
        }
        for (int i = 1; i <= 3; i++) {
            if ((n - i) % 4 == 0) {
                return true;
            }
        }
        return false;
    }
}
