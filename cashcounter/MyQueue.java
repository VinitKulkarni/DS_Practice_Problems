package com.bridgelabz.datastructureprograms.cashcounter;

import java.util.Scanner;

public class MyQueue<T> {
    MyLinkedList linkedList;
    public MyQueue(){
        this.linkedList = new MyLinkedList();
    }
    Scanner sc = new Scanner(System.in);
    public void enqueue(T data) {
        linkedList.append(data);
    }

    public void printQueue() {
        if(linkedList.calculateSize() > 0) {
            System.out.print("Queue elements are: ");
            linkedList.display();
        }else{
            System.out.println("Queue is empty. Cannot display elements");
        }
    }


    public void startProcessingQueue() {
        while(linkedList.calculateSize() > 0) {
            linkedList.requestProcessing();
            System.out.print("Names of person standing in Queue: ");linkedList.display();
        }
    }
}
