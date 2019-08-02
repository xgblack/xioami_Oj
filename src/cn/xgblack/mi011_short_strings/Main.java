package cn.xgblack.mi011_short_strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 小光
 * @date 2019/8/2 19:15
 * className: Main
 * description: 给定任意一个较短的字符串，和另一个较长的字符串，
 *              判断短的字符串是否能够由长字符串中的字符组合出来，且长串中的每个字符只能用一次。
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
            String[] strs = line.split(" ");
            char[] c1 = strs[0].toCharArray();
            char[] c2 = strs[1].toCharArray();
            List<Character> list = new ArrayList<>();
            for (int i = 0; i < c2.length; i++) {
                list.add(c2[i]);
            }

            boolean flag = true;

            for (int i = 0; i < c1.length; i++) {
                for (int j = 0; j < list.size(); j++) {
                    if (c1[i] == list.get(j)) {
                        list.remove(j);
                        break;
                    }
                    if (j == list.size() - 1 && c1[i] != list.get(j)) {
                        flag = false;
                    }
                }
            }
             System.out.println(flag);
        }
    }
}
