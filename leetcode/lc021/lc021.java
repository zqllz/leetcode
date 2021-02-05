package lc021;

import basic.ListNode;

import java.util.Random;

/**
 * @author yuluyang
 * @date 2020/12/21 19:45
 * @since 1.0.0-SNAPSHOT
 */
public class lc021 {
    public static void main(String[] args) {
        System.out.println(new Random(1).nextInt(100));
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(1);
        ListNode cur = res;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            cur.next = l1;
        }
        if (l2 != null) {
            cur.next = l2;
        }
        return res.next;
    }
}
