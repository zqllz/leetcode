package lc238;

import java.util.Arrays;

/**
 * @author yuluyang
 * @date 2021/1/30 下午9:22
 * @since 1.0.0-SNAPSHOT
 */
public class lc238 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        right[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = left[i] * right[i];
        }
        return nums;
    }

    public int[] productExceptSelf1(int[] nums) {
        int count = 1;
        for (int i : nums) {
            if (i == 0) {
                Arrays.fill(nums, 0);
                return nums;
            }
            count *= i;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = count / nums[i];
        }
        return nums;
    }
}