package lc136;

/**
 * @author yuluyang
 * @date 2020/12/21 17:32
 * @since 1.0.0-SNAPSHOT
 */
public class lc136 {
}

class Solution {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            res = res ^ nums[i + 1];
        }
        return res;
    }
}
