package cn.xgblack.leetcode.l0709to_lower_case;

/**
 * @author 小光
 * @date 2019/11/7 16:00
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution {
    public String toLowerCase(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 65 + 26) {
                c += 32;
            }
            res += c;
        }
        return res;
    }
}
