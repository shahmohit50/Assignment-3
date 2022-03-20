public class DeleteAdjacentDuplicate {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        
        while(head != null && head.next != null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            }else{
                if(head.next != null){
                 head = head.next;
            }
            }
            
           
        }
        
        return node;
    }
}
