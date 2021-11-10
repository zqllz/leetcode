import java.util.Arrays;

public class lc260 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new lc260().singleNumber(new int[]{1, 1, 2, 2, 3, 5})));
    }

    public int[] singleNumber(int[] nums) {
        int tmp = 0;
        for (int i : nums) {
            tmp ^= i;
        }
        int low = 1;
        while ((tmp & low) == 0) {
            low <<= 1;
        }
        int[] res = new int[2];
        for (int n : nums) {
            if ((n & low) == 0) {
                res[0] = res[0] ^ n;
            } else {
                res[1] = res[1] ^ n;
            }
        }
        return res;
    }
}
