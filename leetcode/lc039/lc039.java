package lc039;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yuluyang
 * @date 2021/1/30 下午4:37
 * @since 1.0.0-SNAPSHOT
 */
public class lc039 {
    public static void main(String[] args) {

    }
}

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(candidates, target, res, 0, new ArrayList<>());
        return res;
    }

    private void backTrack(int[] candidates, int target, List<List<Integer>> res, int i, ArrayList<Integer> tmp_list) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(tmp_list));
            return;
        }
        for (int start = i; start < candidates.length; start++) {
            if (target < 0) {
                break;
            }
            tmp_list.add(candidates[start]);
            backTrack(candidates, target - candidates[start], res, start, tmp_list);
            tmp_list.remove(tmp_list.size() - 1);
        }
    }
}

