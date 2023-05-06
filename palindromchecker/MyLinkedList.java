package com.bridgelabz.datastructureprograms.palindromchecker;

public class MyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    public void append(T data){
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display(){
        Node<T> temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public T deleteFirst(){
        T value = null;
        Node<T> temp = head;
        if (head == tail && head != null) {
            value = head.data;
            head = null;
            tail = null;
        } else {
            while (temp.next != tail && head != null) {
                temp = temp.next;
            }
            value = tail.data;
            tail = temp;
            tail.next = null;
        }
        return value;
    }

    public int calculateSize(){
        Node temp = head;
        Integer elementCount = 0;
        if (head == tail && head != null && tail != null){
            elementCount = 1;
        }else {
            while (temp != null) {
                elementCount = elementCount + 1;
                temp = temp.next;
            }
        }
        return elementCount;
    }

    public void pointer(){
        System.out.println("head=>"+head.data);
        System.out.println("tail=>"+tail.data);
    }
}
