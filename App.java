public class App {

    Node head;
    static class Node {
        int data;
        Node next;
    
        Node(int dat){
            data = dat;
            next = null;
        }
    
    }
    public static App Linsert(App list, int data) {
        Node node = new Node(data);
        node.next = null;

        if (list.head == null) {
            list.head = node;
        }else{
            Node last = list.head;
            while (last.next != null ) {
                last = last.next; 
            }
            last.next = node;
        }
        return list;
    }

    public static App LinsertAt(App list, int data, int index) {
        Node node = new Node(data);
        node.next = null;

        if (list.head == null) {
            list.head = node;
        }else{
            Node last = list.head;
            int count = 0;
            while (last.next != null  && count< index-1) {
                last = last.next;
                count ++;
            }
            if (last.next == null) {
                last.next = node;
            }else{
                node.next = last.next;
                last.next = node;
            }
        }
        return list;
    }

    public static void printList(App list) {
        Node last = list.head;
        while (last != null) {
            System.out.print(last.data+"  ");
            last = last.next;
        }
    }

    public static void main(String[] args) throws Exception {
        App l1 = new App();
        Linsert(l1, 2);
        Linsert(l1, 23);
        Linsert(l1, 232);
        printList(l1);
        System.out.println( " ");
        LinsertAt(l1, 12, 2);
        printList(l1);
    }

 
    
}

