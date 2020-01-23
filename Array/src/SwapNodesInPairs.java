import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.List;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode terceiro = head.next.next;
        ListNode segundo = head.next;
        ListNode primeiro = head;

        segundo.next = primeiro;

        primeiro.next = swapPairs(terceiro);
        return segundo;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);

        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        System.out.println(swapNodesInPairs.swapPairs(root));
    }
}

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }