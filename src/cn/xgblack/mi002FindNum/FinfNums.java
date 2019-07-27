package cn.xgblack.mi002FindNum;

import java.util.Scanner;

/**
 * @author 小光
 * @date 2019/7/27 9:36
 * className: FinfNums
 * description: 给出N个数字。其中仅有一个数字出现过一次，其他数字均出现过两次，
 *              找出这个出现且只出现过一次的数字。要求时间和空间复杂度最小。
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class FinfNums {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String line;
        while (scan.hasNextLine()) {
            line = scan.nextLine().trim();
            String[] nums = line.split(" ");

            for (int i = 0; i < nums.length; i++) {
                int temp = 0;
                for (int j = 0; j <nums.length; j++) {
                    if (i != j) {
                        if (nums[i].equals(nums[j])) {
                            temp++;
                        }
                    }
                }
                if (temp == 0) {
                    System.out.println(nums[i]);
                }
            }
            
        }
    }
}
