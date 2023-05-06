package com.bridgelabz.datastructureprograms.palindromchecker;

public class MyQueue<T> {
    MyLinkedList linkedList;
    public MyQueue(){
        this.linkedList = new MyLinkedList();
    }

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

    public String dequeue() {
        String reverseData = "";
        if(linkedList.calculateSize() > 0) {
            char temp = (Character) linkedList.deleteFirst();
            System.out.println("Removed front element from queue is: "+ temp);
            reverseData = reverseData + temp;
        }else{
            System.out.println("Queue is empty. Cannot remove element");
        }
        return reverseData;
    }

    public void pointerValue(){
        if(linkedList.calculateSize() > 0) {
            linkedList.pointer();
        }else{
            System.out.println("Queue is empty. Cannot remove element");
        }
    }

    public int queueSize(){
        return linkedList.calculateSize();
    }
}
