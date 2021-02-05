package lc461;

/**
 * @author yuluyang
 * @date 2020/12/19 9:59
 * @since 1.0.0-SNAPSHOT
 */
public class lc461 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.hammingDistance(1,4));
    }
}

class Solution {
    public int hammingDistance(int x, int y) {
        StringBuffer xx = new StringBuffer(Integer.toBinaryString(x)).reverse();
        StringBuffer yy = new StringBuffer(Integer.toBinaryString(y)).reverse();
        int count = 0;
        StringBuffer lenStr = xx.length() > yy.length() ? xx : yy;
        StringBuffer shoStr = xx.length() <= yy.length() ? xx : yy;
        while (lenStr.length() != shoStr.length()) {
            shoStr.append("0");
        }
        for (int i = 0; i < lenStr.length(); i++) {
            if (xx.charAt(i) != yy.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public int hammingDistance1(int x, int y) {
        return Integer.bitCount(x^y);
    }
}