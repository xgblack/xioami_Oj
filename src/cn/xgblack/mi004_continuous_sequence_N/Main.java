package cn.xgblack.mi004_continuous_sequence_N;

import java.util.Scanner;

/**
 * @author 小光
 * @date 2019/7/29 22:48
 * className: Main
 * description: 输入一个乱序的连续数列，输出其中最长连续数列长度，要求算法复杂度为 O(n) 。
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
            String[] nums = line.split(",");
            int temp = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i].length() > temp) {
                    temp = nums[i].length();
                }
            }
            System.out.println(temp);

            // System.out.println("answer");
        }
    }
}
