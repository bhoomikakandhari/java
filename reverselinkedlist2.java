import java.lang.classfile.components.ClassPrinter.ListNode;

public class reverselinkedlist2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){
            return head;
        }
        ListNode Bhooms = new ListNode(0);
        Bhooms.next=head;

        ListNode prev= Bhooms;
        for(int i =1; i<left;i++){
            prev = prev.next;
        }

        ListNode start = prev.next;
        ListNode then = start.next;

        for(int i =0;i<right-left;i++){
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }
        return Bhooms.next;
    }
}
