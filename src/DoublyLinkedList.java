import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private  ListNode head;
    private  ListNode tail;
    private int length;

    public class ListNode{
        int val;
        ListNode previous;
        ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void displayForward() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.print("null");

    }

    public void displayBackward() {
        ListNode temp = tail;
        while(temp != null) {
            System.out.print(temp.val + " --> ");
            temp = temp.previous;
        }
        System.out.print("null");
    }

    public void addFirst(int val) {
        ListNode newNode = new ListNode(val);
        if(isEmpty()) {
            tail = newNode;
        }
        else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertLast(int val) {
        ListNode newNode = new ListNode(val);
        if(isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public ListNode deleteFirst() {
        ListNode temp = head;
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;

    }

    public ListNode deleteLast() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if(head == tail) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }
}
