public class lc376 {

    public static void main(String[] args) {
        System.out.println(new lc376().isPerfectSquare(2147483647));
    }

    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            long sqr = (long) mid * mid;
            if (sqr < num) {
                left = mid + 1;
            } else if (sqr > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
