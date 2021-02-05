package lc121;

/**
 * @author yuluyang
 * @date 2021/1/7 11:31
 * @since 1.0.0-SNAPSHOT
 */
public class lc121 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit1(new int[]{7, 1, 5, 3, 4, 6}));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                int nowProfit = prices[j] - prices[i];
                maxProfit = Math.max(nowProfit, maxProfit);
            }
        }
        return maxProfit;
    }

    public int maxProfit1(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int[] maxProfitArr = new int[prices.length];
        maxProfitArr[0] = 0;
        int minIndex = 0;
        for (int i = 1; i < prices.length; i++) {
            minIndex = prices[minIndex] > prices[i] ? i : minIndex;
            int curMax = prices[i] > prices[i - 1] ? prices[i] - prices[minIndex] : maxProfitArr[i - 1];
            maxProfitArr[i] = Math.max(curMax, maxProfitArr[i - 1]);
        }
        return maxProfitArr[prices.length - 1];
    }
}
