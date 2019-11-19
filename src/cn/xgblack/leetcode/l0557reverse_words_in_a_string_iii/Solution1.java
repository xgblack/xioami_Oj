package cn.xgblack.leetcode.l0557reverse_words_in_a_string_iii;

/**
 * @author xgBLACK
 * @date 2019/11/19 10:21
 * description:
 */
public class Solution1 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            res.append(new StringBuilder(words[i]).reverse().toString() + " ");
        }
        return res.toString().trim();
    }
}
