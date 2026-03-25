import java.lang.classfile.components.ClassPrinter.ListNode;

public class removenodes {
     public ListNode removeNodes(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode reversedHead = reverse(head);
        ListNode current = reversedHead;

        ListNode resultHead = new ListNode(0);
        ListNode resultCurrent = resultHead;
           int maxVal = Integer.MIN_VALUE;
          while(current != null){
            if(current.val >= maxVal){
              resultCurrent.next = current;
              resultCurrent = resultCurrent.next;
             maxVal = current.val;  
            }
            current = current.next;
          }
          resultCurrent.next = null;
           return reverse(resultHead.next);
    }
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        while(current!= null){
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }
}
