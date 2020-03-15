package org.itstack.code.leetcode.test;

import org.itstack.code.leetcode.Solution;
import org.junit.Test;

/**
 * 公众号：bugstack虫洞栈 | 沉淀、分享、成长，让自己和他人都能有所收获！
 * 博  客：http://bugstack.cn
 * Create by 小傅哥 on @2020
 */
public class ApiTest {

    @Test
    public void test_lengthOfLongestSubstring_1() {

        System.out.println("预期结果3 " + new Solution().lengthOfLongestSubstring_1("abcabcbb"));
        System.out.println("预期结果2 " + new Solution().lengthOfLongestSubstring_1("abba"));
        System.out.println("预期结果3 " + new Solution().lengthOfLongestSubstring_1("pwwkew"));
        System.out.println("预期结果2 " + new Solution().lengthOfLongestSubstring_1("au"));
        System.out.println("预期结果5 " + new Solution().lengthOfLongestSubstring_1("nfpdmpi"));

    }

    @Test
    public void test_lengthOfLongestSubstring_2() {
        System.out.println("预期结果3 " + new Solution().lengthOfLongestSubstring_2("abcabcbb"));
        System.out.println("预期结果2 " + new Solution().lengthOfLongestSubstring_2("abba"));
        System.out.println("预期结果3 " + new Solution().lengthOfLongestSubstring_2("pwwkew"));
        System.out.println("预期结果2 " + new Solution().lengthOfLongestSubstring_2("au"));
        System.out.println("预期结果5 " + new Solution().lengthOfLongestSubstring_2("nfpdmpi"));
    }

    @Test
    public void test_lengthOfLongestSubstring_4() {
        System.out.println("预期结果3 " + new Solution().lengthOfLongestSubstring_4("abcabcbb"));
        System.out.println("预期结果2 " + new Solution().lengthOfLongestSubstring_4("abba"));
        System.out.println("预期结果3 " + new Solution().lengthOfLongestSubstring_4("pwwkew"));
        System.out.println("预期结果2 " + new Solution().lengthOfLongestSubstring_4("au"));
        System.out.println("预期结果5 " + new Solution().lengthOfLongestSubstring_4("nfpdmpi"));
    }

    @Test
    public void test_lengthOfLongestSubstring_5() {
        System.out.println("预期结果3 " + new Solution().lengthOfLongestSubstring_5("abcabcbb"));
        System.out.println("预期结果2 " + new Solution().lengthOfLongestSubstring_5("abba"));
        System.out.println("预期结果3 " + new Solution().lengthOfLongestSubstring_5("pwwkew"));
        System.out.println("预期结果2 " + new Solution().lengthOfLongestSubstring_5("au"));
        System.out.println("预期结果5 " + new Solution().lengthOfLongestSubstring_5("nfpdmpi"));
    }

}
