package lc414;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.*;

public class lc414 {

    public static void main(String[] args) {
        System.out.println(new lc414().thirdMax(new int[]{2,2,3,1}));
    }

    public int thirdMax(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, i);
        }
        int n = map.size();
        Integer[] res = new Integer[n];
        int index = 0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            res[index++] = m.getKey();
        }
        Arrays.sort(res, Collections.reverseOrder());
        if (res.length < 3) {
            return res[0];
        } else {
            return res[2];
        }
    }
}
