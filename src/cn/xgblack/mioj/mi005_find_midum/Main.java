package cn.xgblack.mioj.mi005_find_midum;

import java.util.Scanner;

/**
 * @author 小光
 * @date 2019/7/29 23:04
 * className: Main
 * description:给出一个有序数列随机旋转之后的数列，
 *              如原有序数列为：[0,1,2,4,5,6,7] ，旋转之后为[4,5,6,7,0,1,2]。
 *             假定数列中无重复元素，且数列长度为奇数。
 *             求出旋转数列的中间值。如数列[4,5,6,7,0,1,2]的中间值为4。
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
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (Integer.parseInt(nums[i]) > Integer.parseInt(nums[j])) {
                        String temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }

            System.out.println(nums[nums.length / 2]);
        }
    }
}
