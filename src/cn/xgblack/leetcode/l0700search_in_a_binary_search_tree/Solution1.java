package cn.xgblack.leetcode.l0700search_in_a_binary_search_tree;

/**
 * @author 小光
 * @date 2019/11/16 16:08
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution1 {
    TreeNode res = null;
    public TreeNode searchBST(TreeNode root, int val) {
        search(root,val);
        return res;
    }

    private void search(TreeNode node, int val) {
        if (node != null) {
            if (node.val == val) {
                res = node;
            } else if (node.val < val) {
                search(node.right, val);
            } else {
                search(node.left,val);
            }
        }
    }
}
