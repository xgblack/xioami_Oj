package cn.xgblack.leetcode.l1108defanging_an_ip_address;

/**
 * @author 小光
 * @date 2019/11/3 21:41
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.defangIPaddr("1.1.1.1"));
    }
}
