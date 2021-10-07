package lc434;

public class lc434 {

    public static void main(String[] args) {
        System.out.println(new lc434().countSegments("    foo    bar"));
    }

    public int countSegments(String s) {
        if (s.equals("")) return 0;
        String[] split = s.split(" +");
        int count = 0;
        for (String ss : split) {
            if (ss.equals("")) {
                count++;
            }
        }
        return split.length - count;
    }
}
