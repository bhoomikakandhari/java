 public class deletenode {
 
    
 
 public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> deleteSet = new HashSet<>();  
        for(int num : nums){
           deleteSet.add(num); 
        }
        ListNode Bhooms = new ListNode(0);
        Bhooms.next = head;
        ListNode current = Bhooms;

        while(current.next!= null){
            if( deleteSet.contains(current.next.val)){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }

        return Bhooms.next;
    }
}