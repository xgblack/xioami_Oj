package cn.xgblack.leetcode.l0237delete_node;

/**
 * @author 小光
 * @date 2019/8/7 18:28
 * className: Solution
 * description: 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 *
 *
 * 分析：本题中无法访问到要删除节点的上一个节点，因此使用常规方法是无法删除的。
 * 而题目强调要删除节点不是最后一个节点且为有效节点，因此，我们可以采用将要删除节点的下一个节点复制到要删除的节点，
 * 然后删除要删除节点的下一节点，达到删除node节点的目的。
 *
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }
}
