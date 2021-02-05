package lc070;

/**
 * @author yuluyang
 * @date 2020/12/19 15:06
 * @since 1.0.0-SNAPSHOT
 */
public class lc070 {
    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(45));
    }
}

class Solution {
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }
}