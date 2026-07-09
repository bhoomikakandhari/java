// import java.lang.classfile.components.ClassPrinter.ListNode;

// public class insertionsort {
//     public ListNode insertionSortList(ListNode head) {
//         ListNode dummy = new ListNode(0);
//         ListNode current = head;

//         while(current != null){
//             ListNode prev = dummy;
//             ListNode next = current.next;

//             while(prev.next != null && prev.next.val < current.val){
//                 prev = prev.next;
//             }
//             current.next = prev.next;
//             prev.next = current;
//             current = next;
//         }
//         return dummy.next;
//     }
// }
