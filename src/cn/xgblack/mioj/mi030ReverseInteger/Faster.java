package cn.xgblack.mioj.mi030ReverseInteger;

import java.util.Scanner;

/**
 * @author 小光
 * @date 2019/8/7 14:29
 * className: Faster
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Faster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line;
        while (scan.hasNextLine()) {
            line = scan.nextLine().trim();
            long num = Long.parseLong(line);
            String binaryString = Long.toBinaryString(num);
            binaryString = addLeadingZero(binaryString, 32);
            String reverseBinaryString = reverseString(binaryString);
            long answer = Long.parseLong(reverseBinaryString, 2);
            System.out.println(answer);
        }
    }

    private static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        return sb.toString();
    }

    private static String addLeadingZero(String binaryString, int len) {
        StringBuilder sb = new StringBuilder(binaryString);
        while (sb.length() != len) {
            sb.insert(0, 0);
        }
        return sb.toString();
    }
}
