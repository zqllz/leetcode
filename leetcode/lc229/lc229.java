package lc229;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lc229 {

    public static void main(String[] args) {
        System.out.println(new lc229().majorityElement(new int[]{1}));
    }

    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int limit = nums.length / 3;
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (int i : map.keySet()) {
            if (map.get(i) > limit) {
                list.add(i);
            }
        }
        return list;
    }
}
