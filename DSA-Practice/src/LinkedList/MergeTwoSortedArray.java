package LinkedList;

public class MergeTwoSortedArray {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode mergeTwoLists(ListNode p, ListNode q) {
        ListNode dummy = new ListNode(-1);
        ListNode ptr = dummy;
        while(p != null && q != null){
            if(p.val <= q.val){
                ptr.next = p;
                p = p.next;
            }else{
                ptr.next = q;
                q = q.next;
            }
            ptr = ptr.next;
        }
        if(p != null){
            ptr.next = p;
        }else {
            ptr.next = q;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(6);


        ListNode merged = mergeTwoLists(l1, l2);
        while (merged != null){
            System.out.print(merged.val+ " -> ");
            merged = merged.next;
        }
        System.out.print("null");
    }
}
