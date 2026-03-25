import java.lang.classfile.components.ClassPrinter.ListNode;

public class reorderlist {
    public void reorderList(ListNode head) {
        if(head == null|| head.next == null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // ListNode prev = null;
        // ListNode current = head;
        // while(current!= null){
        //     ListNode nextTemp = current.next;
        //     current.next = prev;
        //     prev = current;
        //     current = nextTemp;
        // }

        ListNode second = reverse(slow.next);
        slow.next = null;

        ListNode first = head;
        // ListNode second = prev;

        while(second != null ){
             ListNode temp1 = first.next;
             ListNode temp2 = second.next;

             first.next = second;
             second.next = temp1;

             first = temp1;
             second = temp2;
        }
    }
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }
}
