package lc453;

import java.util.Arrays;

public class lc453 {

    public static void main(String[] args) {

    }

    public int minMoves(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int res = 0;
        for (int i : nums) {
            res += i - min;
        }
        return res;
    }
}
