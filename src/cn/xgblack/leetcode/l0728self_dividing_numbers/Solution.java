package cn.xgblack.leetcode.l0728self_dividing_numbers;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 小光
 * @date 2019/11/14 9:12
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            boolean flag = false;
            String num = String.valueOf(i);
            for (int j = 0; j < num.length(); j++) {
                int n = Integer.parseInt(String.valueOf(num.charAt(j)));
                if (n == 0 || i % n != 0) {
                    flag = false;
                    break;
                }
                flag = true;
            }
            if (flag) {
                res.add(i);
            }
        }
        return res;
    }
}
