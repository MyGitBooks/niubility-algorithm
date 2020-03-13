package org.itstack.code.leetcode.test;

import com.alibaba.fastjson.JSON;
import org.itstack.code.leetcode.Solution;
import org.junit.Test;

public class ApiTest {

    private int[] nums = {2, 7, 11, 15};

    @Test
    public void test_twoSum_0() {
        int[] ints = Solution.twoSum_0(nums, 9);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }

    @Test
    public void test_twoSum_1() {
        int[] ints = Solution.twoSum_1(nums, 9);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }

    @Test
    public void test_towSum_2() {
        int[] ints = Solution.towSum_2(nums, 9);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }

    @Test
    public void test_idx() {

        int volume = 32;                // 100000000000
        int bitMode = volume - 1;       // 011111111111
        int[] t = new int[volume];

        int[] nums = {-3, 4, 3, 29, 0, -2};

        for (int i = 0; i < nums.length; i++) {
            int idx = nums[i] & bitMode;
            int val = i + 1;
            t[idx] = i + 1;
            System.out.println("值：" + nums[i] + " 位置：" + idx + " 结果：" + val);
        }

        System.out.println(JSON.toJSONString(t));

    }

    @Test
    public void test_for() {
        int sum = 1, n = 10;
        while (sum < n) {
            sum = sum * 2;
        }
    }

}
