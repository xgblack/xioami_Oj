package cn.xgblack.leetcode.l0589n_ary_tree_preorder_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 小光
 * @date 2019/11/15 8:47
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
public class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        pre(root);
        return res;
    }

    private void pre(Node node) {
        if (node == null) {
            return;
        }
        res.add(node.val);
        if (node.children != null && node.children.size() > 0) {
            for (Node child : node.children) {
                pre(child);
            }
        }

    }


    public static void main(String[] args) {
        Node root = new Node();
        root.val = 1;

        List<Node> list1 = new ArrayList<>();
        list1.add(new Node(5, null));
        list1.add(new Node(6, null));
        Node node1 = new Node(3, list1);

        List<Node> list = new ArrayList<>();
        list.add(node1);
        list.add(new Node(2, null));
        list.add(new Node(4, null));

        root.children = list;

        Solution s = new Solution();
        List<Integer> p = s.preorder(root);
        System.out.println(p);
    }
}
