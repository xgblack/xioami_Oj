package cn.xgblack.leetcode.l0942di_string_match;

/**
 * @author xgBLACK
 * @date 2019/11/17 17:09
 * description:
 */
public class Solution {
    public int[] diStringMatch(String S) {
        int[] res = new int[S.length() + 1];
        for (int i = 0; i <= S.length(); i++) {
            res[i] = i;
        }
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'D') {
                if (res[i] <= res[i + 1]) {
                    change(res, i, i + 1);
                }
            }
            if (i >= 1 && S.charAt(i) == 'I') {
                if (res[i] >= res[i + 1]) {
                    change(res, i - 1, i);
                }
            }
        }
        return res;
    }

    private static void change(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
