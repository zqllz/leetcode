/**
 * date: 2021-11-08 22:54:56
 * author: yuluyang
 * version: 1.0
 */
public class lc299 {
    public static void main(String[] args) {
        System.out.println(new lc299().getHint("1807", "7810"));
    }

    public String getHint(String secret, String guess) {
        int len = secret.length();
        int counta = 0;
        int countb = 0;
        int[] counts = new int[10];
        int[] countg = new int[10];
        for (int i = 0; i < len; i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                counta++;
            } else {
                counts[secret.charAt(i) - '0']++;
                countg[guess.charAt(i) - '0']++;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (counts[i] != 0 && countg[i] != 0) {
                countb += Math.min(counts[i], countg[i]);
            }
        }
        return counta + "A" + countb + "B";
    }
}
