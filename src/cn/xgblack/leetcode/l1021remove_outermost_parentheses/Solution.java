package cn.xgblack.leetcode.l1021remove_outermost_parentheses;

/**
 * @author 小光
 * @date 2019/11/5 10:20
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution {
    public String removeOuterParentheses(String S) {
        int num = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (num == 0 && S.charAt(i) == '(') {
                num++;
                continue;
            }
            if (S.charAt(i) == '(') {
                num++;
            } else if (S.charAt(i) == ')') {
                num--;
            }
            if (num == 0 && S.charAt(i) == ')') {
                continue;
            }
            res.append(S.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeOuterParentheses("(()())(())"));
    }
}
