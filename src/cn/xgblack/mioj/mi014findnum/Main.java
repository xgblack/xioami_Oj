package cn.xgblack.mioj.mi014findnum;

import java.util.Scanner;

/**
 * @author 小光
 * @date 2019/8/7 11:22
 * className: Main
 * description: 假设一个有序的数组，经过未知次数的旋转（例如0 1 2 4 5 6 7 被旋转成 4 5 6 7 0 1 2），
 *              从中查找一个目标值，如果存在，返回其下标，不存在，返回-1。注：假设数组无重复数字
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
            String[] arr = line.split(" ");
            String[] nums = arr[0].split(",");
            for (int i = 0; i < nums.length; i++) {
                if (arr[1].equals(nums[i])) {
                    System.out.println(i);
                    return;
                }else {
                    if (i == nums.length - 1) {
                        System.out.println(-1);
                    }
                }


            }

        }
    }
}
