package com.bridgelabz.datastructureprograms.balanceparanthesis;

public class MyLinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
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

    public void showTail(){
        System.out.println(tail.data);
    }

    public T deleteLast(){
        T value = null;
        Node<T> temp = head;
        if(head == tail){
            value = head.data;
            head = null;
            tail = null;
        }else {
            while (temp.next != tail) {
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
}
