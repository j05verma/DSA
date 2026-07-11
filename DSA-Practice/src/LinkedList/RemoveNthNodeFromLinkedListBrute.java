package LinkedList;

public class RemoveNthNodeFromLinkedListBrute {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode current = head;

        while(current != null){
            count ++;
            current = current.next;
        }

        int position = count - n;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        current = dummy;
        for(int i = 0; i < position; i++){
            current = current.next;
        }
        current.next = current.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode h = new ListNode(1);
        h.next = new ListNode(2);
        h.next.next = new ListNode(3);
        h.next.next.next = new ListNode(4);
        h.next.next.next.next = new ListNode(5);

        ListNode result = removeNthFromEnd(h, 2);
        while( result != null){
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.print("null");
    }
}
