package cn.xgblack.mi014findnum;

import java.util.Scanner;

/**
 * @author 小光
 * @date 2019/8/7 11:30
 * className: Fastest
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Fastest {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String line;
        while (scan.hasNextLine()) {
            line = scan.nextLine().trim();
            // please write your code here
            String[] arr = line.split(" ");
            int[] array = getArray(arr[0].split(","));
            int target = Integer.parseInt(arr[1]);
            System.out.println(currentIndex(array, target));
            // System.out.println("answer");
        }
    }
    static int[] getArray(String[] arr) {
        int length = arr.length;
        int[] array = new int[length];
        for(int i = 0 ; i < arr.length; i++) {
            array[i] = Integer.parseInt(arr[i]);
        }
        return array;
    }
    static int currentIndex(int [] array, int target) {
        int length = array.length;
        for (int i = 0 ; i < length; i++) {
            if(array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
