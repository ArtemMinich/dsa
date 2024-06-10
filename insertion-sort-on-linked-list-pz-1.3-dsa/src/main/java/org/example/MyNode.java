package org.example;

class MyNode {
    private int data;
    private MyNode next;

    MyNode(int data) {
        this.data = data;
        this.next = null;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}