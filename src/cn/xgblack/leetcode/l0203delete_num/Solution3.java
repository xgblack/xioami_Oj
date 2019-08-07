package cn.xgblack.leetcode.l0203delete_num;

/**
 * @author 小光
 * @date 2019/8/7 16:23
 * className: solution3
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution3 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        /*
        ListNode res = removeElements(head.next, val);
        if (head.val == val) {
            return res;
        } else {
            head.next = res;
            return head;
        }
        */
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        Solution3 solution = new Solution3();
        System.out.println(solution.removeElements(head, 6));
    }
}
