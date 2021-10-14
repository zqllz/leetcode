package lc441;

public class lc441 {

    public static void main(String[] args) {
        System.out.println(new lc441().arrangeCoins(8));
    }

    public int arrangeCoins(int n) {
        if (n < 1) return 0;
        int index = 1;
        while (true) {
            n -= index;
            index++;
            if (n < 0) {
                return index - 2;
            }
        }
    }
}
