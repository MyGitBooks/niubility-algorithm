package org.itstack.code.leetcode;

/**
 * 公众号：bugstack虫洞栈 | 沉淀、分享、成长，让自己和他人都能有所收获！
 * 博  客：http://bugstack.cn
 * Create by 小傅哥 on @2020
 */
public class Solution {

    //(2 -> 4 -> 3) + (5 -> 6 -> 4)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode root = new ListNode(0);
        ListNode current = root;
        int carry = 0;               // 进位

        while (l1 != null || l2 != null || carry != 0) {

            int l1Val = null == l1 ? 0 : l1.val;
            int l2Val = null == l2 ? 0 : l2.val;

            int sum = l1Val + l2Val + carry;

            if (sum >= 10) {
                ListNode nextNode = new ListNode(sum - 10);
                current.next = nextNode;
                current = nextNode;
                carry = 1;
            } else {
                ListNode nextNode = new ListNode(sum);
                current.next = nextNode;
                current = nextNode;
                carry = 0;
            }

            l1 = null == l1 ? null : l1.next;
            l2 = null == l2 ? null : l2.next;
        }

        return root.next;
    }

}


