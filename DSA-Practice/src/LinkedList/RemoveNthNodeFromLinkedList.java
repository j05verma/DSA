package LinkedList;

public class RemoveNthNodeFromLinkedList {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode h = new ListNode(1);
        h.next = new ListNode(2);
        h.next.next = new ListNode(3);
        h.next.next.next = new ListNode(4);
        h.next.next.next.next = new ListNode(5);

    ListNode result = removeNthFromEnd(h, 5);
        while( result != null){
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.print("null");
    }
}
