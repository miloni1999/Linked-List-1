//TC = O(n)
//SC = O(1)
public class ReverseLL {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        while(fast!=null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        head = curr;
        return head;
    }
}
