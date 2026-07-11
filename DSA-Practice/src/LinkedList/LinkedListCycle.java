package LinkedList;

import java.util.HashSet;

public class LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode current = head;
        while(current != null){
            if(visited.contains(current)){
                return true;
            }
            visited.add(current);
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);

        a.next = b;
        b.next = c;
        c.next = b;

        System.out.println(hasCycle(a));
    }
}
