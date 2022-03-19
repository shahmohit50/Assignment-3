import java.rmi.server.RemoteStub;
import java.util.List;

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
    public static App Ldelete(App list,int index) {
        if (list.head != null) {
            Node cur = list.head;
            int count = 0;
            while(count < index-1){
                if (cur == null) {
                    System.out.println("Invalid Index");
                    break;
                }
                cur = cur.next;
                count++;
            }
            cur.next = cur.next.next;

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

    public static void printListIndex(App list,int index) {
        Node last = list.head;
        int count = 0;
        while (last != null) {
            if(count >= index){
                System.out.print(last.data+"  ");
            }
            last = last.next;
            count++;
        }
    }

    public static int SearchNode(App list,int data) {
        boolean flag = false;
        int count =0;
        if (list.head == null){
            System.out.println("No Search Space");
        }else {
            Node curr = list.head;
                        
            while (curr != null) {
                if (curr.data == data) {
                    flag = true;
                    break;
                }
                curr = curr.next;
                count++;
            }
           
        }
        if (flag) {
            return count;
        }
        return -1;
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
        System.out.println( " ");
        printListIndex(l1, 2);        
        Ldelete(l1, 2);
        System.out.println( " ");
        printList(l1);
        System.out.println( " ");
        System.out.println("23 is present at index : " +SearchNode(l1, 23));

    }


    
}

