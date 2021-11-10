/**
 * date: 2021-11-10 22:53:34
 * author: yuluyang
 * version: 1.0
 */
public class lc496 {
    public static void main(String[] args) {

    }

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int max = timeSeries.length * duration;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i + 1] - timeSeries[i] < duration) {
                max -= (duration - (timeSeries[i + 1] - timeSeries[i]));
            }
        }
        return max;
    }
}
