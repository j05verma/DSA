package LinkedList;

public class ReverseLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode reverseNode(ListNode head) {
        if ( head == null ){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode prevNode = null;
        ListNode currNode = head;

        while (currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        ListNode reverse = reverseNode(head);
        while (reverse != null){
            System.out.print(reverse.val + " -> ");
            reverse = reverse.next;
        }
        System.out.print("null");
    }
}
