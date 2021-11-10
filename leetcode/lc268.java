public class lc268 {

    public static void main(String[] args) {
        System.out.println(new lc268().missingNumber(new int[]{3,0,1}));
    }

    public int missingNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        for (int i = 0; i <= nums.length; i++) {
            res ^= i;
        }
        return res;
    }
}
