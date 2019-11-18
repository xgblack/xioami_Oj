package cn.xgblack.leetcode.l0942di_string_match;

/**
 * @author xgBLACK
 * @date 2019/11/17 17:09
 * description:
 */
public class Solution {
    public int[] diStringMatch(String S) {
        int[] res = new int[S.length() + 1];
        int l = 0, r = S.length();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                res[i] = l++;
            } else {
                res[i] = r--;
            }
        }
        res[S.length()] = l;
        return res;
    }
}
