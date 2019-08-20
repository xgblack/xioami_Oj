package cn.xgblack.leetcode.l0347High_Frequency_Elements;

import java.util.*;

/**
 * @author 小光
 * @date 2019/8/20 15:04
 * className: Solution
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution1 {

    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(
                (a,b)-> map.get(a) - map.get(b)
        );
        for (int key : map.keySet()) {
            if (queue.size() < k) {
                queue.offer(key);
            } else {
                if (map.get(key) > map.get(queue.peek())) {
                    queue.poll();
                    queue.offer(key);
                }
            }
        }
        LinkedList<Integer> list = new LinkedList<>();
        while (!queue.isEmpty()) {
            list.add(queue.poll());
        }
        return list;
    }
}
