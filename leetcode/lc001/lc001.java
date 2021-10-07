package lc001;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuluyang
 * @date 2020/12/19 14:50
 * @since 1.0.0-SNAPSHOT
 */
public class lc001 {
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}