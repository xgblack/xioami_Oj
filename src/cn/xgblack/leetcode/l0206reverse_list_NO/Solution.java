package cn.xgblack.leetcode.l0206reverse_list_NO;

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
        return reverseList(null, head);
    }

    private ListNode reverseList(ListNode prev, ListNode cur) {
        if (cur == null) {
            return null;
        }
        cur.next = prev;
        prev = cur;
        ListNode node = reverseList(prev, cur.next);

    }




}
