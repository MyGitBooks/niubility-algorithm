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
    public void test_lengthOfLongestSubstring() {

        System.out.println("预期结果3 " + new Solution().lengthOfLongestSubstring("abcabcbb"));
        System.out.println("预期结果2 " + new Solution().lengthOfLongestSubstring("abba"));
        System.out.println("预期结果3 " + new Solution().lengthOfLongestSubstring("pwwkew"));
        System.out.println("预期结果2 " + new Solution().lengthOfLongestSubstring("au"));
        System.out.println("预期结果6 " + new Solution().lengthOfLongestSubstring("bbtablud"));

    }

    @Test
    public void test_lengthOfLongestSubstring_error() {

        System.out.println("预期结果3 " + new Solution().lengthOfLongestSubstring1("abcabcbb"));
        System.out.println("预期结果2 " + new Solution().lengthOfLongestSubstring1("abba"));
        System.out.println("预期结果3 " + new Solution().lengthOfLongestSubstring1("pwwkew"));
        System.out.println("预期结果2 " + new Solution().lengthOfLongestSubstring1("au"));
        System.out.println("预期结果5 " + new Solution().lengthOfLongestSubstring1("nfpdmpi"));

    }

}
