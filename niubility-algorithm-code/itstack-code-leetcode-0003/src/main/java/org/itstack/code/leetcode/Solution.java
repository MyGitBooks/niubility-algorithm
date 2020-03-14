package org.itstack.code.leetcode;

/**
 * 公众号：bugstack虫洞栈 | 沉淀、分享、成长，让自己和他人都能有所收获！
 * 博  客：http://bugstack.cn
 * Create by 小傅哥 on @2020
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (null == s || " ".equals(s) || s.length() == 1) return 1;

        int volume = 2048;
        int bitMode = volume - 1;
        int[] t = new int[volume];

        int max = 0, eq = 0, b = 0;
        int begin = s.charAt(0) & bitMode, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) & bitMode;
            int val = t[idx];
            if (val != 0) {
                eq = i + 1 - val - b;
                t[idx] = i + 1;
                b = val;
                continue;
            }
            t[idx] = i + 1;
            eq++;
            max = max >= eq ? max : eq;
        }

        return max > eq ? max : eq;
    }

    public int lengthOfLongestSubstring1(String s) {
        if (null == s || "".equals(s)) return 0;
        if (" ".equals(s) || s.length() == 1) return 1;

        int volume = 2048;
        int bitMode = volume - 1;
        int[] t = new int[volume];

        int beginIdx = s.charAt(0) & bitMode, endIdx = 0, maxSize = 0;
        t[beginIdx] = 1;
        for (int i = 1; i < s.length(); i++) {
            endIdx = s.charAt(i) & bitMode;
            int val = t[endIdx];

            if (val != 0 && val >= t[beginIdx]) {

                beginIdx = s.charAt(val) & bitMode;
                t[beginIdx] = val + 1;

            }
            t[endIdx] = i + 1;

            int v = t[endIdx] - t[beginIdx] + 1;
            maxSize = maxSize >= v ? maxSize : v;
        }

        return maxSize;
    }

}
