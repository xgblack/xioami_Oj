package cn.xgblack.leetcode.l1021remove_outermost_parentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 小光
 * @date 2019/11/5 10:20
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution2 {
    public String removeOuterParentheses(String S) {
        if (S.length() == 0) {
            return "";
        }
        int num = 0,begin = 0,end;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                num++;
            } else if (S.charAt(i) == ')') {
                num--;
            }
            if (num == 0) {
                end = i;
                list.add(S.substring(begin, end + 1));
                begin = end + 1;
            }
        }
        StringBuilder res = new StringBuilder();
        for (String s : list) {
            res.append(s.substring(1, s.length() - 1));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.removeOuterParentheses("(()())(())"));
    }
}
