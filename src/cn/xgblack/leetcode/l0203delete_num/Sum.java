package cn.xgblack.leetcode.l0203delete_num;

/**
 * @author 小光
 * @date 2019/8/7 15:49
 * className: Sum
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Sum {
    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    private static int sum(int[] arr, int l) {
        int num = 0;
        if (l == arr.length) {
            return 0;
        } else {
            return arr[l] + sum(arr, l + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(arr));
    }
}
