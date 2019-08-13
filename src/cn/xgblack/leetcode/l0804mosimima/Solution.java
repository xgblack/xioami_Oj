package cn.xgblack.leetcode.l0804mosimima;

import java.util.*;

/**
 * @author 小光
 * @date 2019/8/13 17:35
 * className: Solution
 * description: 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串，
 *               比如: "a" 对应 ".-", "b" 对应 "-...", "c" 对应 "-.-.", 等等。
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] m = {".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-",
                "..-","...-",".--","-..-","-.--","--.."};

        Map<Character, String> map = new HashMap<>(26);
        char c = 'a';
        for (int i = 0; i < m.length; i++) {
            map.put(c, m[i]);
            c++;
        }

        Set<String> set = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                sb.append(map.get(chars[i]));
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
