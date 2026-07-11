package LinkedList;

public class MiddleOfLinkedList {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode h = new ListNode(1);
        h.next = new ListNode(2);
        h.next.next = new ListNode(3);
        h.next.next.next = new ListNode(4);
        h.next.next.next.next = new ListNode(5);
        h.next.next.next.next.next = new ListNode(6);

        ListNode result = middleNode(h);
        while (result != null){
            System.out.print(result.val+" ");
            result = result.next;
        }
    }
}
