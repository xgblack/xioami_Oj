package cn.xgblack.leetcode.l0020kuohao;

import java.util.Stack;

/**
 * @author 小光
 * @date 2019/7/27 17:23
 * className: TestKuoHao
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character> ();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char topChar = stack.pop();

                if (c == ')' && topChar != '(') {
                    return false;
                }
                if (c == ']' && topChar != '[') {
                    return false;
                }
                if (c == '}' && topChar != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


public class TestKuoHao {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isValid("()[]"));
        System.out.println(s.isValid("(]"));
    }


}
