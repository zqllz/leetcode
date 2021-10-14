package lc002;

import basic.ListNode;

public class lc002 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.println(new lc002().addTwoNumbers(l1, l2));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1 = new StringBuilder();
        while (l1 != null) {
            s1.append(l1.val);
            l1 = l1.next;
        }
        StringBuilder s2 = new StringBuilder();
        while (l2 != null) {
            s2.append(l2.val);
            l2 = l2.next;
        }
        Long i1 = Long.valueOf(s1.reverse().toString());
        Long i2 = Long.valueOf(s2.reverse().toString());
        StringBuilder s3 = new StringBuilder((i1 + i2) + "").reverse();
        ListNode res = new ListNode(3);
        ListNode l3 = res;
        int index = 0;
        while (index < s3.length()) {
            int i = s3.charAt(index++) - 48;
            l3.next = new ListNode(i);
            l3 = l3.next;
        }
        return res.next;
    }
}
