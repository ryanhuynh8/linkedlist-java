package com.company;

import com.company.datastruct.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.insertLast(1);
        singlyLinkedList.insertLast(2);
        singlyLinkedList.deleteFirst();
        singlyLinkedList.insertFirst(1);
        singlyLinkedList.insertLast(1);
        singlyLinkedList.printLinkedList();
        singlyLinkedList.clearAll();
        singlyLinkedList.printLinkedList();
    }
}
