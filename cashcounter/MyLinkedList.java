package com.bridgelabz.datastructureprograms.cashcounter;

import java.util.Scanner;

public class MyLinkedList<T> {
    Node<T> head;
    Node<T> tail;

    static float bankCash = 500000; //the cash bank has at initial

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

    public void requestProcessing(){
        Scanner sc = new Scanner(System.in);
        Node<T> temp = head;
        System.out.println();
        System.out.println("Welcome To AxisBank " +temp.data);
        System.out.println("1.Deposit 2.Withdraw");
        System.out.print("Enter the choice " +temp.data+": ");
        int choice = sc.nextInt();


        switch (choice){
            case 1:
                System.out.print("Enter the amount to deposite:");
                int depositAmount = sc.nextInt();
                bankCash = bankCash + depositAmount;
                deleteFirst();
                break;
            case 2:
                System.out.print("Enter the amount to withdraw:");
                int withdrawAmount = sc.nextInt();
                bankCash = bankCash - withdrawAmount;
                deleteFirst();
                break;
            default:
                System.out.println("error");
                break;
        }
        System.out.println("Bank has this much ==>" +bankCash+ " amount");
        System.out.println();
    }

    //remove the element(person)
    public T deleteFirst(){
        T value;
        if(head.next == null){
            value = head.data;
            head = null;
        }else {
            Node temp = head.next;
            value = head.data;
            head = head.next;
        }
        return value;
    }
}
