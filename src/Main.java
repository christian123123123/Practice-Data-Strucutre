import com.sun.source.tree.Tree;

import javax.swing.*;
import java.util.*;

import static java.lang.Integer.signum;
import static java.lang.Integer.toBinaryString;

public class Main {
    public static void main(String[]  args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertLast(1);
        linkedList.insertLast(2);
        linkedList.insertLast(9);
        linkedList.insertLast(10);
        linkedList.insertLast(15);
        linkedList.insertLast(71);
        linkedList.setHead(linkedList.reverse());
        SinglyLinkedList middle = new SinglyLinkedList();
        middle.setHead(linkedList.findMiddle());
        System.out.println("Middle node: " + middle.getVal());
        linkedList.display();





        System.out.print("listNode size: ");
        System.out.print(linkedList.size());
        System.out.println();
        System.out.printf("listNode: ");
        linkedList.display();

        SinglyLinkedList linkedList1 = new SinglyLinkedList();
        linkedList1.insertLast(5);
        linkedList1.insertLast(100);
        linkedList1.insertLast(97);
        linkedList1.insertLast(71);

        System.out.print("linkedlist1 size: " + linkedList1.size());
        System.out.println();

        System.out.printf("listNode1: ");
        linkedList1.display();

        SinglyLinkedList mergedLinkedList = new SinglyLinkedList();
        mergedLinkedList.setHead(SinglyLinkedList.merge(linkedList.getHead(), linkedList1.getHead()));

        System.out.print("listNodeMerged: " );
        mergedLinkedList.display();



    }
}







