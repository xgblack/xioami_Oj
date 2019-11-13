package cn.xgblack.leetcode.l0104maximum_depth_of_binary_tree;

/**
 * @author 小光
 * @date 2019/11/13 16:58
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int numLeft = maxDepth(root.left);
        int numRight = maxDepth(root.right);
        return Math.max(numLeft, numRight) + 1;
    }
}
