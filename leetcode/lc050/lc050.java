package lc050;

public class lc050 {

    public double myPow(double x, int n) {
        if (x == 0) return 0;
        if (n == 1) return 1;
        long nn = (long) n;
        return nn > 0 ? pow(x, nn) : 1 / pow(x, -nn);
    }

    public double pow(double x, long nn) {
        if (nn == 0) return 1;
        double half = pow(x, nn / 2);
        return nn % 2 == 0 ? half * half : half * half * x;
    }

    public static void main(String[] args) {
        System.out.println(new lc050().myPow(2.0, -200));
    }
}
