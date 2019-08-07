package cn.xgblack.mioj.mi001ab;

import java.util.Scanner;

/**
 * @author 小光
 * @date 2019/7/27 9:28
 * className: Main2
 * description: 和所有的 OJ 平台一样，第一题作为热身题，也是送分题：给出两个非负数 a 和 b，输出 a+b的结果。
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line;
        while (scan.hasNextLine()) {
            line = scan.nextLine().trim();
            String[] array = line.split(" ");
            long sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += Long.parseLong(array[i]) ;
            }
            System.out.println(sum);
        }
    }
}
