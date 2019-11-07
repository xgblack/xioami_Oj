package cn.xgblack.leetcode.l0938range_sum_of_bst;


/**
 * @author 小光
 * @date 2019/11/7 15:03
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution2 {
    int res = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        range(root, L, R);
        return res;
    }

    private void range(TreeNode node, int L, int R) {
        if (node != null) {
            if (node.val >= L && node.val <= R) {
                res += node.val;
            }
            if (node.val > L) {
                range(node.left, L, R);
            }
            if (node.val < R) {
                range(node.right, L, R);
            }
        }
    }

}
