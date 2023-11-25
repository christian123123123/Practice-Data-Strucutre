import java.util.List;
import java.util.ListIterator;

// Random practicing exercices, mostly on arrays

class Exercise {

    public int[] removeEven(int[] arr) {

        //Knowing the number of odds in arr to know the size of the resulting array
        int oddCount = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                oddCount++;
            }
        }

        //Instatiating a new array with the size of the odds
        int[] newArr = new int[oddCount];

        //an index that starts at 0 and that we increment steadily to prevent out of bounds error
        int idx = 0;

        //adding all odd numbers to new arr
        for (int j : arr) {
            if (j % 2 != 0) {
                newArr[idx] = j;
                idx++;
            }
        }

        //printing the resulting array
        printArray(newArr);

        //returning the resulting array
        return newArr;
    }

    public void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public int[] reverseArr(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int idx = 0;
        for (int i = n - 1; i >= 0; i--) {
            result[idx] = arr[i];
            idx++;
        }
        return result;
    }

    public int[] reverseArr2(int[] arr, int start, int end) {
        while (start < end) {
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
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public void moveZeroToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }

    public int findMissingNumber(int[] arr) {
        return 0;
    }

    public boolean isPalindrome(String arr) {
        int end = arr.length() - 1;
        int start = 0;
        while (start < end) {
            if (arr.charAt(start) != arr.charAt(end)) {
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
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public <Thing> void printLinkedList(List<Thing> head) {
        ListIterator<Thing> iterator = head.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext()) {
                System.out.print("->");
            }
        }
        System.out.println();
    }

    public int size(List<Integer> head) {
        ListIterator<Integer> iterator = head.listIterator();
        int count = 0;
        while (iterator.hasNext()) {
            count++;
            iterator.next();
        }
        return count;
    }


    public boolean isPalindromestr(String s) {
        String strs = removeNonAlphanumeric(s);
        int start = 0;
        int end = strs.length() - 1;
        while (start <= end) {
            if (strs.charAt(start) != strs.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public String removeNonAlphanumeric(String str) {
        // replace the given string
        // with empty string
        // except the pattern "[^a-zA-Z0-9]"
        str = str.replaceAll(
                "[^a-zA-Z0-9]", "");

        // return string
        return str;
    }
}