import java.lang.classfile.components.ClassPrinter.ListNode;

public class swappingnodes {
    public ListNode swapNodes(ListNode head, int k) {
            if(head == null || head.next == null){
            return head;
        }

        ListNode first = head;
        ListNode second = head;
        ListNode current = head;


        int length = 0;
        while(current!= null){
            length ++;
            current = current.next;
        }
        for(int i =1; i <k ; i++){
            first = first.next;
        }
        for(int i = 0; i<length-k;i++){
            second = second.next;
        }
        int temp = first.val;
        first.val= second.val;
        second.val = temp;
        return head;
    }
}
