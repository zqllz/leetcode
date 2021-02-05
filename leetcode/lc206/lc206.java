package lc206;

import basic.ListNode;

/**
 * @author yuluyang
 * @date 2021/1/30 下午5:11
 * @since 1.0.0-SNAPSHOT
 */
public class lc206 {
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}