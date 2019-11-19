package cn.xgblack.leetcode.l0541reverse_string_ii;

/**
 * @author xgBLACK
 * @date 2019/11/19 10:41
 * description:
 */
public class Solution2 {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        for (int start = 0; start < c.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, c.length - 1);
            while (i < j) {
                char temp = c[i];
                c[i++] = c[j];
                c[j--] = temp;
            }
        }
        return new String(c);
    }


    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.reverseStr("abcdefg", 2));
    }
}
