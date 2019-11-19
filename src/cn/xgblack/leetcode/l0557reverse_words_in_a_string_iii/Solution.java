package cn.xgblack.leetcode.l0557reverse_words_in_a_string_iii;

/**
 * @author xgBLACK
 * @date 2019/11/19 10:21
 * description:
 */
public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                res.append(reverseWord(words[i]));
            } else {
                res.append(reverseWord(words[i]) + " ");
            }
        }
        return res.toString();
    }

    private String reverseWord(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("word");
        System.out.println(sb.reverse());
    }
}
