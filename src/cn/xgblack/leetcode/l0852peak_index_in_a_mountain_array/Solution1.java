package cn.xgblack.leetcode.l0852peak_index_in_a_mountain_array;

/**
 * @author xgBLACK
 * @date 2019/11/19 9:51
 * description:
 */
public class Solution1 {
    public int peakIndexInMountainArray(int[] A) {
        int res = 0;
        int start = 0,end = A.length - 1;
        while (end >= start) {
            int i = start + (end - start) / 2;
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                res = i;
                break;
            }else if (A[i] > A[i - 1] && A[i] < A[i + 1]) {
                start = i;
            }else {
                end = i;
            }
        }
        return res;
    }
}
