package com.company.datastruct;

public class Node<E> {
    public E item;
    public Node next;
    public void displayNodeData() {
        System.out.println("{ " + item.toString() + " } ");
    }
}
