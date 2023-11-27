import java.util.List;

//Practice on Linked Lists
public class SinglyLinkedList {

    private ListNode head;

    public void setHead(ListNode newHead){
        head = newHead;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public ListNode getHead() {
        return head;
    }


    public int getVal(){
        return head.val;
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if(head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while(null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        //a: 1->2->3->4
        //b: 4->5->6->7
        //dummy: 0->1->2->3->4
        // tail: ^->^->^->^->^->

        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }

        return dummy.next;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public int size(){
        int count = 0;
        while(head!=null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public  void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int index, int value) {
        ListNode node = new ListNode(value);
        if (index == 1) {
            node.next = head;
            head = node;
        }
        else {
            ListNode previous = head;
            int count = 1;
            while (count < index - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current  = previous.next;
            node.next = current;
            previous.next = node;
        }
    }

    public ListNode deleteFirst() {
        if(head==null) {
            return null;
        }

        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast() {
        if(head == null) {
            return null;
        }
        else {
            ListNode temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            return temp;
        }
    }

    public ListNode delete(int index) {
        if (index == 1) {
            head = head.next;
            return head;
        }
        else {
            ListNode previous = head;
            int count = 1;
            while(count < index - 1) {
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = current.next;
            return previous;
        }

    }

    public int find(int value) {
        ListNode temp = head;
        int count = 0;
        while(temp.next != null) {
            if(temp.val == value) {
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }

    public ListNode reverse(){
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public ListNode findMiddle(){
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }
}
