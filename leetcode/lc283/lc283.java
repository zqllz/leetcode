package lc283;

/**
 * @author yuluyang
 * @date 2020/12/21 16:25
 * @since 1.0.0-SNAPSHOT
 */
public class lc283 {
    public static void main(String[] args) {
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int index = 1;
        for (int i = 0; i + index + 1 < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = nums[i + index];
                nums[i + 1] = 0;
                nums[i] = temp;
            }
            if (nums[i + index] == 0 && nums[i + index + 1] == 0) {
                index++;
                i--;
            }
        }
    }
}