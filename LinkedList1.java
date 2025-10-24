
import java.util.*;

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList1 {

    static Node head;

    static void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    static int getNth(Node head, int index) {
        int count = 1;
        Node current = head;

        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        return -1; // Index not found
    }

    static void printList(Node n) {
        System.out.print("Linked list:");
        while (n != null) {
            System.out.print("-->" + n.data);
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Using try-with-resources to properly manage Scanner
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            head = null;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                push(x);
            }

            int index = sc.nextInt();
            printList(head);
            System.out.println("Node at index=" + index + ":" + getNth(head, index));
        }
    }
}
