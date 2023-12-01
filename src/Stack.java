import java.util.EmptyStackException;

public class Stack {
    private ListNode top;
    private int length;

    private class ListNode {
        private final int val;
        private ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    public Stack() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int val) {
        ListNode temp = new ListNode(val);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        int result = top.val;
        top = top.next;
        length--;
        return result;
    }

    public int peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return top.val;
    }

}
