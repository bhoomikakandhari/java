// import java.lang.classfile.components.ClassPrinter.ListNode;
// import java.util.PriorityQueue;

// public class mergeksortedlist {
//     public ListNode mergeKLists(ListNode[] lists) {
//        if(lists == null || lists.length == 0){
//         return null;
//        }

//        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b)-> Integer.compare(a.val,b.val));

//        for(ListNode node: lists){
//         if(node != null){
//             minHeap.add(node);
//         }
//        }
//        ListNode dummy = new ListNode(0);
//        ListNode tail = dummy;

//        while(!minHeap.isEmpty()){
//         ListNode smallest = minHeap.poll();

//         tail.next = smallest;
//         tail = tail.next;

//         if(smallest.next != null){
//             minHeap.add(smallest.next);
//         }
//        }
//        return dummy.next;
//     }
// }
