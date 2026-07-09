// import java.lang.classfile.components.ClassPrinter.ListNode;

// public class sortlist {
//     public ListNode sortList(ListNode head) {
//         if(head == null || head.next == null){
//             return head;
//         }
//         ListNode middle = getMiddle(head);
//         ListNode nextOfMiddle = middle.next;
//         middle.next = null;

//         ListNode left = sortList(head);
//         ListNode right = sortList(nextOfMiddle);
//         return merge(left,right);
//     }
//     private ListNode getMiddle(ListNode head){
//         if(head==null){
//             return head;
//         }
//         ListNode slow = head;
//         ListNode fast = head.next;

//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
//     private ListNode merge(ListNode left, ListNode right){
//         ListNode sortedList = new ListNode(0);
//         ListNode current = sortedList;

//         while(left != null && right != null){
//             if(left.val <= right.val){
//                 current.next = left;
//                 left = left.next;
//             }else{
//                 current.next = right;
//                 right = right.next;
//             }
//             current = current.next;
//         }
//         if(left != null){
//             current.next = left;
//         }else{
//              current.next = right;
//         }
//       return sortedList.next;  
//     }
// }
