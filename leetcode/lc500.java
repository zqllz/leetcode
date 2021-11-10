import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;


public class lc500 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new lc500().findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }

    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        StringBuilder sb1 = new StringBuilder("qwertyuiop");
        List<String> res = new ArrayList<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (!s1.contains((chars[i] + "").toLowerCase(Locale.ROOT))) {
                    break;
                }
                if (i == chars.length - 1) {
                    res.add(word);
                }
            }
            for (int i = 0; i < chars.length; i++) {
                if (!s2.contains((chars[i] + "").toLowerCase(Locale.ROOT))) {
                    break;
                }
                if (i == chars.length - 1) {
                    res.add(word);
                }
            }
            for (int i = 0; i < chars.length; i++) {
                if (!s3.contains((chars[i] + "").toLowerCase(Locale.ROOT))) {
                    break;
                }
                if (i == chars.length - 1) {
                    res.add(word);
                }
            }
        }
        String[] result = new String[res.size()];
        return res.toArray(result);
    }
}
