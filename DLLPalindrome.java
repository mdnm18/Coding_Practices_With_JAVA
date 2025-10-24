class Node {

    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {

    Node head;
    Node tail;

    // Insert node at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Check if DLL is palindrome
    public boolean isPalindrome() {
        Node left = head;
        Node right = tail;

        while (left != null && right != null && left != right && right.next != left) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.prev;
        }
        return true;
    }
}

public class DLLPalindrome {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Example input: Palindrome list
        dll.insert(1);
        dll.insert(2);
        dll.insert(3);
        dll.insert(2);
        dll.insert(1);

        System.out.print("Doubly Linked List: ");
        dll.display();

        if (dll.isPalindrome()) {
            System.out.println("The list is a Palindrome.");
        } else {
            System.out.println("The list is NOT a Palindrome.");
        }

        // Test with non-palindrome list
        DoublyLinkedList dll2 = new DoublyLinkedList();
        dll2.insert(1);
        dll2.insert(2);
        dll2.insert(3);
        dll2.insert(4);
        dll2.insert(5);

        System.out.print("Second Doubly Linked List: ");
        dll2.display();

        if (dll2.isPalindrome()) {
            System.out.println("The list is a Palindrome.");
        } else {
            System.out.println("The list is NOT a Palindrome.");
        }
    }
}
