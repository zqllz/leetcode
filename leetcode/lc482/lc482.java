package lc482;

import java.util.Locale;

public class lc482 {

    public static void main(String[] args) {
        System.out.println(new lc482().licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }

    public String licenseKeyFormatting(String s, int k) {
        String s1 = s.replaceAll("-", "");
        int index = s1.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (index >= 0) {
            sb.append(s1.charAt(index));
            if ((s1.length() - index) % k == 0 && index != 0) {
                sb.append("-");
            }
            index--;
        }
        return sb.reverse().toString().toUpperCase();
    }
}
