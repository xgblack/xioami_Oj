package cn.xgblack.mi002FindNum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 小光
 * @date 2019/7/27 9:48
 * className: TheFast
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */

//小河虾 提交于 2019年06月06日 18:12

public class TheFast {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int arr[] = new int[1000000];

    public static void main(String args[]) throws IOException {

        String s = br.readLine();

        int r = 0;
        int i = 0;

        String [] sp  = s.split(" ");

        for(String spam : sp){
            arr[i] = Integer.parseInt(sp[i]);
            r = r^arr[i++];
        }

        System.out.println(r);

    }
}
