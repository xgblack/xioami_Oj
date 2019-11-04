package cn.xgblack.leetcode.l1221split_a_string_in_balanced_strings;

import java.util.LinkedList;

/**
 * @author 小光
 * @date 2019/11/4 9:26
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution {
    public int balancedStringSplit(String s) {
        int result = 0;
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (list.size() == 0 || list.peekLast().equals(s.charAt(i))) {
                list.add(s.charAt(i));
            } else {
                list.removeLast();
                if (list.size() == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
