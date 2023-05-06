package com.bridgelabz.datastructureprograms.orderedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.sortAndPush(70);
        linkedList.display();

        linkedList.sortAndPush(50);
        linkedList.display();

        linkedList.sortAndPush(90);
        linkedList.display();

        linkedList.sortAndPush(1);
        linkedList.display();

        linkedList.sortAndPush(20);
        linkedList.display();

        linkedList.sortAndPush(10);
        linkedList.display();

        //if search found delete it
        //if search not found add it

        linkedList.searchElement(70);
        linkedList.display();
        linkedList.searchElement(197);
        linkedList.display();

        linkedList.searchElement(39);
        linkedList.display();

        linkedList.searchElement(39);
        linkedList.display();
    }
}
