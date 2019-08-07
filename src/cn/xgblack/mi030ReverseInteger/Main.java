package cn.xgblack.mi030ReverseInteger;

import java.util.Scanner;

/**
 * @author 小光
 * @date 2019/8/7 11:38
 * className: Main
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String line;
        while (scan.hasNextLine()) {
            line = scan.nextLine().trim();
            //int i = Integer.parseInt(line);
            String s = Integer.toBinaryString(Integer.parseInt(line));

            int[] nums = new int[32];

            char[] chars = s.toCharArray();
            for (int i = 0; i < nums.length; i++) {
                if (i < nums.length - chars.length) {
                    nums[i] = 0;
                } else {
                    nums[i] = Integer.parseInt("" + chars[i - (32 - chars.length)]);
                }
            }

            long ret = 0;
            for (int i = 0; i < nums.length; i++) {
                ret += nums[i] * (long) Math.pow(2, i);
            }
            System.out.println(ret);
        }
    }
}
