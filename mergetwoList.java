public     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    Listnode node = new Listnode(0);
    while(true){
        while(list1.next != null){
            if(list1.val <= list2.val){
                node = new ListNode(list1.val);
            }
            list1 = list1.next;
        }
        list2 = list2.next;
    }
    return node;
}class mergetwoList {
    
}
