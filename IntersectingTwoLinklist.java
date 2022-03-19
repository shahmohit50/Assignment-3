/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int data = -1111;
        boolean flag = false;
        ListNode node = headB;
       while(headA != null ){
           
           if(flag){
               break;
           }
           node = headB;
           while(node != null){
               // System.out.println(headA.next);
                // System.out.println(node.next);
               if(headA == node){
                   flag = true;
                   break;
               }
               if(headA.next == node.next){
                   
               data = headA.val;
                   flag = true;
               break;
           }
               node = node.next;
           }
           
           headA = headA.next;
           
       } 
        // System.out.println("Intersected at "+data);?
    if(flag){
        if(data == -1111){
            return node;
        }
         return node.next;
    }else{
        return null;
    }
       
    }
}