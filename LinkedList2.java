
import java.util.*;

class LinkedList2 {

    static class node {

        int data;
        node next;

        node(int d) {
            data = d;
            next = null;
        }
    }
    node head;

    // Insert at the beginning
    void push(int new_data) {
        node new_node = new node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Print the linked list
    void printList() {
        node tempNode = head;
        while (tempNode != null) {
            System.out.print("-->" + tempNode.data);
            tempNode = tempNode.next;
        }
    }

    // Swap two nodes without swapping data
    void swapNodes(int x, int y) {
        if (x == y) {
            return;
        }

        node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) {
            return;
        }

        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        node temp = currY.next;
        currY.next = currX.next;
        currX.next = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            // Use LinkedList2, not java.util.LinkedList
            LinkedList2 linkedList = new LinkedList2();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                linkedList.push(arr[i]);
            }

            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.print("before Swapping:");
            linkedList.printList();
            linkedList.swapNodes(x, y);
            System.out.print("\nafter Swapping:");
            linkedList.printList();

        } finally {
            sc.close();
        }
    }
}
