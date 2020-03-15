package org.itstack.code.leetcode;

/**
 * 公众号：bugstack虫洞栈 | 沉淀、分享、成长，让自己和他人都能有所收获！
 * 博  客：http://bugstack.cn
 * Create by 小傅哥 on @2020
 */
public class Solution {

    public int lengthOfLongestSubstring_2(String s) {
        if (null == s || "".equals(s)) return 0;
        if (" ".equals(s) || s.length() == 1) return 1;

        int beginIdx = 0, endIdx = 0, maxSize = 0;
        for (int i = 1; i < s.length(); i++) {
            endIdx = i;

            int existIdx = s.indexOf(s.charAt(i), beginIdx);
            if (existIdx < endIdx) {
                beginIdx = existIdx + 1;
            }

            int eval = endIdx - beginIdx + 1;
            if (maxSize < eval) {
                maxSize = eval;
            }
        }

        return maxSize;
    }

    public int lengthOfLongestSubstring_1(String s) {
        if (null == s || "".equals(s)) return 0;
        if (" ".equals(s) || s.length() == 1) return 1;

        int volume = 128;
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
            if (v > maxSize) {
                maxSize = v;
            }
        }

        return maxSize;
    }

    public int lengthOfLongestSubstring_3(String s) {
        char[] array = s.toCharArray();
        int[] exist = new int[127];
        int result = 0;
        int i1 = 0;
        int i2 = 0;
        for (; i2 < array.length; i2++) {
            if (exist[array[i2]] >= i1 + 1) {
                result = Math.max(i2 - i1, result);
                i1 = exist[array[i2]];
            }
            exist[array[i2]] = i2 + 1;
        }
        return Math.max(i2 - i1, result);
    }

    public int lengthOfLongestSubstring_4(String s) {
        if (null == s || "".equals(s)) return 0;
        if (" ".equals(s) || s.length() == 1) return 1;

        char[] array = s.toCharArray();
        int[] exist = new int[127];
        exist[array[0]] = 1;
        int beginIdx = 1, maxSize = 0;
        for (int i = 1; i < array.length; i++) {
            if (exist[array[i]] >= beginIdx) {
                beginIdx = exist[array[i]] + 1;
            }
            exist[array[i]] = i + 1;

            maxSize = Math.max(exist[array[i]] - beginIdx + 1, maxSize);
        }
        return maxSize;
    }

    public int lengthOfLongestSubstring_5(String s) {
        if (null == s || "".equals(s)) return 0;
        if (" ".equals(s) || s.length() == 1) return 1;

        char[] array = s.toCharArray();
        int[] exist = new int[127];
        exist[array[0]] = 1;
        int beginIdx = 1, endIdx = 1, maxSize = 0;
        for (int i = 1; i < array.length; i++) {
            endIdx = i;
            if (exist[array[i]] >= beginIdx) {
                maxSize = Math.max(i - beginIdx + 1, maxSize);
                beginIdx = exist[array[i]] + 1;
            }
            exist[array[i]] = i + 1;

        }
        maxSize = Math.max(exist[array[endIdx]] - beginIdx + 1, maxSize);
        return maxSize;
    }

}
