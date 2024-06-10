package org.example;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(5,4,2,7,1,6);
        System.out.println("Given list:");
        System.out.println(myLinkedList);

        System.out.println("Output list:");
        myLinkedList.setHead(insertionSort(myLinkedList.getHead()));
        System.out.println(myLinkedList);
    }

    public static MyNode insertionSort(MyNode head) {
        MyNode sorted = null;
        MyNode current = head;
        while (current != null) {
            MyNode next = current.getNext();
            sorted = sortedInsert(sorted, current);
            current = next;
        }
        return sorted;
    }

    public static MyNode sortedInsert(MyNode sorted, MyNode newNode) {
        if (sorted == null || sorted.getData() >= newNode.getData()) {
            newNode.setNext(sorted);
            sorted = newNode;
        } else {
            MyNode current = sorted;
            while (current.getNext() != null && current.getNext().getData() < newNode.getData()) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        return sorted;
    }
}