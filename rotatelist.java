// import java.lang.classfile.components.ClassPrinter.ListNode;

// public class rotatelist {
//       public ListNode rotateRight(ListNode head, int k) {
//        if(head==null || head.next==null){
//         return head;
//        } 
//           ListNode current = head;
//           int length=1;
//           while(current.next!=null){
//                current = current.next;
//                length++;
//           }

//           current.next = head;

//           k = k%length;

//           if(k == 0){
//             current.next = null;
//             return head;
//           }

//           int list = length-k;
//           ListNode newTail = head;
//           for(int i =1; i<list;i++){
//             newTail = newTail.next;
//           }

//           ListNode newHead = newTail.next;
//           newTail.next = null;

//           return newHead;
//     }
// }
