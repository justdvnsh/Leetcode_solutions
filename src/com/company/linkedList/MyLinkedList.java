package com.company.linkedList;

class Node {
    int data;
    Node next;
}

class MyLinkedList {

    private Node head = null;

    /** Initialize your data structure here. */
    public MyLinkedList() {}

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node temp = head;
        int currentIndex = 0;
        while(currentIndex < index && temp != null) {
            temp = temp.next;
            currentIndex++;
        }
        if (temp != null) return temp.data;
        else return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node temp = head;
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = temp;
        head = newNode;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;
        temp.next = newNode;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node current = null;
        Node temp = head;
        int currentIndex = 0;
        while(currentIndex < index && temp != null) {
            current = temp;
            temp = temp.next;
            currentIndex++;
        }
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = temp;
        if (current != null) current.next = newNode;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index == 0) head = head.next;
        Node prev = null;
        Node temp = head;
        int currentIndex = 0;
        while(currentIndex < index && temp != null) {
            prev = temp;
            temp = temp.next;
            currentIndex++;
        }
        if (prev != null && temp != null) prev.next = temp.next;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println("Printing element " + temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1,2);
        list.printList();
        System.out.println(list.get(1));
        list.deleteAtIndex(0);
        list.printList();
        System.out.println(list.get(0));
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
