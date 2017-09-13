package com.company.datastruct;

public class SinglyLinkedList<E> {
    private Node head;

    public boolean isEmpty() {
        return (head == null);
    }

    // used to insert a node at the start of linked list
    public void insertFirst(E data) {
        Node newNode = new Node();
        newNode.item = data;
        newNode.next = head;
        head = newNode;
    }

    // used to delete node from start of linked list
    public Node deleteFirst() {
        Node temp = head;
        head = head.next;
        return temp;
    }

    // used to delete node from start of linked list
    public Node deleteFirst(Node node) {
        Node temp = head;
        head = head.next;
        return temp;
    }

    // Use to delete node after particular node
    public void deleteAfter(Node after) {
        Node temp = head;
        while (temp.next != null && temp.item != after.item) {
            temp = temp.next;
        }
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // used to insert a node at the start of linked list
    public void insertLast(E data) {

        if (head == null) {
            insertFirst(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // we'll loop until current.next is null
            }
            Node newNode = new Node();
            newNode.item = data;
            current.next = newNode;
        }
    }

    public void clearAll() {
        Node next;
        Node current = head;
        while (current != null) {
            next = current.next;
            current = null;
            current = next;
        }
        head = null;
    }

    // For printing Linked List
    public void printLinkedList() {
        System.out.println("Printing LinkedList (head --> last) ");
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }
}
