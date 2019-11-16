package cn.xgblack.mioj.mi010;
import java.util.*;
/**
 * @author 小光
 * @date 2019/11/16 16:34
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
            // please write your code here
            int num = Integer.parseInt(line);
            System.out.println(calculate(num));
            // System.out.println("answer");
        }
    }

    private static int calculate(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return calculate(n - 2) + calculate(n - 1);
    }
}
