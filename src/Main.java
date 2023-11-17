import com.sun.source.tree.Tree;

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


public class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}*/

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

class Exercise {

    List<Integer> integerList = new LinkedList<>();
    List<String> stringList = new LinkedList<>();
    public int[] removeEven(int[] arr) {

        //Knowing the number of odds in arr to know the size of the resulting array
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        //Instatiating a new array with the size of the odds
        int[] newArr = new int[oddCount];

        //an index that starts at 0 and that we increment steadily to prevent out of bounds error
        int idx = 0;

        //adding all odd numbers to new arr
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                newArr[idx] = arr[i];
                idx++;
            }
        }

        //printing the resulting array
        printArray(newArr);

        //returning the resulting array
        return newArr;
    }

    public void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] reverseArr(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int idx = 0;
        for(int i = n - 1; i >= 0; i--) {
            result[idx] = arr[i];
            idx++;
        }
        return result;
    }

    public int[] reverseArr2(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public int findMin(int[] arr) {
        int min = arr[0];
        for(int i = 1 ; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public void moveZeroToEnd(int[] arr) {
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0) {
                j++;
            }
        }
    }

    public int findMissingNumber(int[] arr) {
        return 0;
    }

    public boolean isPalindrome(String arr){
        int end = arr.length() - 1;
        int start = 0;
        while (start < end) {
            if(arr.charAt(start) != arr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean isPalindome(int[] arr) {
        int end = arr.length - 1;
        int start = 0;
        while (start < end) {
            if(arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public void printLinkedList(List<Integer> head) {
        ListIterator<Integer> iterator = head.listIterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next());
            if(iterator.hasNext()) {
                System.out.print("->");
            }
        }
        System.out.println();
    }

}




public class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,4,7,10,6,5}; // 3 7 5  // 2
        int[] arr2 = {1,0,2,0,3,4,0,0,5};
        String palindrome = "madam";
        String notPalindrome = "Hello";
        int[] intPalindrome = {1,2,3,2,1};
        int[] intNotPalindrome = {1,2,3,4,5};
        Exercise exercise = new Exercise();
        exercise.printArray(arr);
        exercise.reverseArr2(arr,0, arr.length - 1) ;
        exercise.printArray(arr);
        int min = exercise.findMin(arr);
        System.out.println(min);
        System.out.println(exercise.findSecondMax(arr));
        exercise.moveZeroToEnd(arr2);
        exercise.printArray(arr2);
        System.out.println(exercise.isPalindrome(palindrome));
        System.out.println(exercise.isPalindrome(notPalindrome));
        System.out.println(exercise.isPalindome(intPalindrome));
        System.out.println(exercise.isPalindome(intNotPalindrome));
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);
        exercise.printLinkedList(linkedList);


    }

}