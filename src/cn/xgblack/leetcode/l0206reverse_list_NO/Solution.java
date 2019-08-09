package cn.xgblack.leetcode.l0206reverse_list_NO;

import java.util.Stack;

/**
 * @author 小光
 * @date 2019/8/9 21:25
 * className: Solution
 * description: !!!!!!!!!内存超限
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        if (stack.empty()) {
            return null;
        }
        ListNode ret = stack.pop();
        cur = ret;
        while (!stack.empty()) {
            cur.next  = stack.pop();
            cur = cur.next;
        }
        return ret;
    }




}
