package cn.xgblack.leetcode.l0303range_sum_query_immutable;

/**
 * @author 小光
 * @date 2019/8/25 16:22
 * Copyright(C),2018-2019,https://blog.xgblack.cn
 * interfaceName: Merger
 * description:
 */
public interface Merger<E> {
    E merge(E a, E b);
}
