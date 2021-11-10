import basic.ListNode;

import java.util.List;

public class lc237 {

    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
}
