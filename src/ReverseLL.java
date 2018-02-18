import java.util.Scanner;

public class ReverseLL {
    Node head;

    private class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
        }
    }

    public void insertAtFront(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void insertAtBack(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
        }
    }

    public void displayElements() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }

    private int findLengthofLL() {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ReverseLL obj = new ReverseLL();
        Scanner sin = new Scanner(System.in);
        for (int e : arr) {
            obj.insertAtBack(e);
        }


        System.out.println("before delete");
        obj.displayElements();
        System.out.println("After reverse");
        obj.reverseLL();
        obj.displayElements();
    }

    private void reverseLL() {
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }


}


