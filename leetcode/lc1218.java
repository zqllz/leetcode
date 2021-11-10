import com.sun.media.sound.SF2InstrumentRegion;

import java.util.HashMap;
import java.util.Map;

public class lc1218 {

    public static void main(String[] args) {
        System.out.println(new lc1218().longestSubsequence(new int[]{1,5,7,8,5,3,4,2,1}, -2));
    }

    public int longestSubsequence(int[] arr, int difference) {
        int ans = 0;
        Map<Integer, Integer> dp = new HashMap<>();
        for (int v : arr) {
            int i = dp.getOrDefault(v - difference, 0);
            dp.put(v, i + 1);
            ans = Math.max(ans, dp.get(v));
        }
        return ans;
    }

//    public int longestSubsequence(int[] arr, int difference) {
//        int ans = 0;
//        int[] dp = new int[arr.length];
//        for (int num : arr) {
//            dp[num] = dp[num - difference] + 1;
//            ans = Math.max(ans, dp[num]);
//        }
//        return ans;
//    }
}
