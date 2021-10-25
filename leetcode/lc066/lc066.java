package lc066;

import java.util.Arrays;

public class lc066 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new lc066().plusOne(new int[]{9,9})));
    }

    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]  = digits[digits.length - 1] + 1;
        int jinwei = 0;
        for (int i = digits.length - 1; i >= 0 ; i--) {
            int res = digits[i] + jinwei;
            if (res > 9) {
                digits[i] = res - 10;
                jinwei = 1;
            } else {
                digits[i] = res;
                jinwei = 0;
            }
        }
        if (jinwei == 1) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            System.arraycopy(digits, 0, res, 1, res.length - 1);
            return res;
        } else {
            return digits;
        }
    }
}
