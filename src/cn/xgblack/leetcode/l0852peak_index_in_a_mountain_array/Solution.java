package cn.xgblack.leetcode.l0852peak_index_in_a_mountain_array;

/**
 * @author xgBLACK
 * @date 2019/11/19 9:51
 * description:
 */
public class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int res = 0;
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                res = i;
                break;
            }
        }
        return res;
    }
}
