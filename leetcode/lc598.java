/**
 * date: 2021-11-07 21:23:01
 * author: yuluyang
 * version: 1.0
 */
public class lc598 {

    public static void main(String[] args) {

    }

    public int maxCount(int m, int n, int[][] ops) {
        int minx = Integer.MAX_VALUE;
        int miny = Integer.MAX_VALUE;
        for (int i = 0; i < ops.length; i++) {
            minx = Math.min(minx, ops[i][0]);
            miny = Math.min(miny, ops[i][1]);
        }
        return minx * miny;
    }
}
