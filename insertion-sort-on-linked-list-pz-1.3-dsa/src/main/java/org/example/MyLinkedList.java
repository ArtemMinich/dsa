package org.example;


public class MyLinkedList {
    private MyNode[] elements;

    private MyNode head;
    public MyLinkedList(int ... elements) {
        this.elements = parseIntegerArrayToMyNodeArray(elements);
        bindNodes();
        head = this.elements[0];
    }

    private void bindNodes(){
        for (int i = 0; i < elements.length-1; i++) {
            elements[i].setNext(elements[i+1]);
        }
    }

    private MyNode[] parseIntegerArrayToMyNodeArray(int[] array){
        MyNode[] nodesArray = new MyNode[array.length];
        for (int i = 0; i < array.length; i++) {
            nodesArray[i] = new MyNode(array[i]);
        }
        return nodesArray;
    }

    public MyNode getHead() {
        return head;
    }

    public void setHead(MyNode head) {
        this.head = head;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        MyNode current = head;
        while (current != null) {
            result.append(current.getData()).append(" ");
            current = current.getNext();
        }
        return result.toString();
    }
}
