package cn.xgblack.mioj.mi003Subtraction;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author 小光
 * @date 2019/7/28 16:17  完成17:36
 * className: Main
 * description: 两个长度超出常规整形变量上限的大数相减，请避免使用各语言内置大数处理库，如 Java.math.BigInteger 等。
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
            String[] nums = line.split("-");


            Stack<Integer> a = new Stack<>();
            Stack<Integer> b = new Stack<>();
            //结果
            Stack<Integer> res = new Stack<>();

            for (int i = 0; i < nums[0].length(); i++) {
                if (i < nums[0].length() - nums[1].length()) {
                    b.push(0);
                }else {
                    b.push(Integer.parseInt(String.valueOf(nums[1].charAt(i - (nums[0].length() - nums[1].length())))));
                }
                a.push(Integer.parseInt(String.valueOf(nums[0].charAt(i))));
            }
            //System.out.println(a);
            //System.out.println(b);
            boolean flag = false;

            while (!a.isEmpty()) {

                int numa = a.pop();
                int numb = b.pop();

                if (flag) {
                    numa = numa - 1;
                }

                if (numa >= numb) {
                    res.push(numa - numb);
                    flag = false;
                }else {
                    res.push(numa + 10 - numb);
                    flag = true;
                }

            }
            while (!res.isEmpty()) {
                System.out.print(res.pop());
            }
            System.out.println();
        }
    }
}

//73854312-5231
//1231231237812739878951331231231237812739878951331231231237812739878951331230000000000000000000000001-331231231237812739878951331231231
