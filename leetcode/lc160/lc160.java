package lc160;

import basic.ListNode;

/**
 * @author yuluyang
 * @date 2020/12/21 18:01
 * @since 1.0.0-SNAPSHOT
 */
public class lc160 {
}


class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tailA = headA;
        ListNode tailB = headB;

        while (tailA.next != null) {
            tailA = tailA.next;
        }
        while (tailB.next != null) {
            tailB = tailB.next;
        }
        ListNode res;
        while (tailA != null && tailB != null) {
            if (tailA.val == tailB.val) {
                res = tailA;
                tailA = tailA.next;
            }
        }
        return null;
    }
}