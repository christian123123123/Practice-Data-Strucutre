import com.sun.source.tree.Tree;

import javax.swing.*;
import java.util.*;

import static java.lang.Integer.toBinaryString;


/*public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
}




/*class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode currentNode = head;
        ListNode result = new ListNode();
        while(currentNode != null) {
            if(currentNode.val != val) {
                System.out.println("val: " + val);
                System.out.println("currentNode.val: " + currentNode.val);
                result.val = val;
                System.out.println("result.val: " + result.val);
                result = result.next;
            }
            currentNode = currentNode.next;
            return result;
        }
        return result;
    }
}*/

public class Main {
    public static void main(String[]  args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertLast(1);
        linkedList.insertLast(2);
        linkedList.insertLast(9);
        linkedList.insertLast(10);
        linkedList.insertLast(15);
        linkedList.insertLast(71);

        System.out.printf("listNode: ");
        linkedList.display();

        SinglyLinkedList linkedList1 = new SinglyLinkedList();
        linkedList1.insertLast(5);
        linkedList1.insertLast(100);
        linkedList1.insertLast(97);
        linkedList1.insertLast(71);

        System.out.printf("listNode1: ");
        linkedList1.display();

        SinglyLinkedList mergedLinkedList = new SinglyLinkedList();
        mergedLinkedList.setHead(SinglyLinkedList.merge(linkedList.getHead(), linkedList1.getHead()));

        System.out.print("listNodeMerged: " );
        mergedLinkedList.display();



    }
}







