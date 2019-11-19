package cn.xgblack.leetcode.l0541reverse_string_ii;

/**
 * @author xgBLACK
 * @date 2019/11/19 10:41
 * description:
 */
public class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        int start = 0,end = 0;
        while ((s.length() - start) > 2 * k) {
            end = start + k - 1;
            res.append(sub(s,start,end).reverse().toString() + sub(s,end + 1,start + 2 * k - 1));
            start = start + 2 * k;
        }
        if ((s.length() - start) >= k) {
            end = start + k - 1;
            res.append(sub(s, start, end).reverse().toString() + sub(s, end + 1, s.length() - 1));
        } else if ((s.length() - start) < k) {
            res.append(sub(s, start, s.length() - 1).reverse().toString());
        }
        return res.toString();
    }

    private StringBuilder sub(String s, int start, int end) {
        StringBuilder res = new StringBuilder();
        for (int i = start; i <= end; i++) {
            res.append(s.charAt(i));
        }
        return res;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverseStr("abcdefg", 2));
    }
}
