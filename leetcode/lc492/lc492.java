package lc492;

public class lc492 {

    public static void main(String[] args) {

    }

    public int[] constructRectangle(int area) {
        int n = (int) Math.sqrt(area);
        int width = n;
        while (area % width != 0) {
            width--;
        }
        return new int[]{area / width, width};
    }
}
