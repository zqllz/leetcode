package lc198;

/**
 * @author yuluyang
 * @date 2021/1/7 15:28
 * @since 1.0.0-SNAPSHOT
 */
public class lc198 {
}

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] maxRob = new int[nums.length];
        maxRob[0] = nums[0];
        maxRob[1] = Math.max(nums[1], maxRob[0]);
        for (int i = 2; i < nums.length; i++) {
            int nowMax = nums[i] + maxRob[i - 2];
            maxRob[i] = Math.max(nowMax, maxRob[i - 1]);
        }
        return maxRob[nums.length - 1];
    }
}