package org.itstack.code.leetcode.test;

import com.alibaba.fastjson.JSON;
import org.itstack.code.leetcode.ListNode;
import org.itstack.code.leetcode.Solution;
import org.junit.Before;
import org.junit.Test;

/**
 * 公众号：bugstack虫洞栈 | 沉淀、分享、成长，让自己和他人都能有所收获！
 * 博  客：http://bugstack.cn
 * Create by 小傅哥 on @2020
 */
public class ApiTest {

    private ListNode l1;
    private ListNode l2;

    @Before
    public void init() {
        l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

    }


    @Test
    public void test_addTwoNumbers() {

        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(l1, l2);

        System.out.println(JSON.toJSONString(listNode));
    }

}
