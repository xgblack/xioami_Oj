package cn.xgblack.leetcode.l0226invert_binary_tree;

/**
 * @author 小光
 * @date 2019/11/11 11:07
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }
    private TreeNode invert(TreeNode node) {
        if (node == null) {
            return null;
        }
        TreeNode temp = node.left;
        node.left = invert(node.right);
        node.right = invert(temp);
        return node;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        Solution solution = new Solution();
        solution.invertTree(root);
        System.out.println(root.left.val);
    }
}
