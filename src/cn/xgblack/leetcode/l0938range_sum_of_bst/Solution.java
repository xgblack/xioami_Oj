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
public class Solution {

    public int rangeSumBST(TreeNode root, int L, int R) {
        return range(root, L, R);
    }

    private int range(TreeNode node, int L, int R) {
        if (node == null) {
            return 0;
        }
        if (node.val >= L && node.val <= R) {
            return range(node.left, L, R) + range(node.right, L, R) + node.val;
        } else {
            return range(node.left, L, R) + range(node.right, L, R);
        }
    }

}
