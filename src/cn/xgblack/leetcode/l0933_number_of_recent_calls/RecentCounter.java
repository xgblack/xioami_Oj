package cn.xgblack.leetcode.l0933_number_of_recent_calls;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xg BLACK
 * @date 2019/12/30 14:27
 * description:
 */
public class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
