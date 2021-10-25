package lc211;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class lc211 {
}

class WordDictionary {

    Map<String, Set<String>> map = new HashMap<>();

    public WordDictionary() {

    }

    public void addWord(String word) {
        String key = word.substring(0, 1);
        Set<String> set;
        if (map.containsKey(key)) {
            set = map.get(key);
        } else {
            set = new HashSet<>();
        }
        set.add(word);
        map.put(key, set);
    }

    public boolean search(String word) {
        String key = word.substring(0, 1);
        if (!key.equals(".") && !map.containsKey(key)) {
            return  false;
        }
        Set<String> set = new HashSet<>();
        if (key.equals(".")) {
            for (String key1 : map.keySet()) {
                set.addAll(map.get(key1));
            }
        } else {
            set = map.get(key);
        }
        P : for (String s : set) {
            if (s.length() != word.length()) {
                continue;
            }
            char[] c1 = word.toCharArray();
            char[] c2 = s.toCharArray();
            boolean flag = false;
            for (int i = 0; i < s.length(); i++) {
                if (c1[i] != c2[i] && c1[i] != '.') {
                    continue P;
                }
            }
            return true;
        }
        return false;
    }
}
