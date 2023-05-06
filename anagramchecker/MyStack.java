package com.bridgelabz.datastructureprograms.anagramchecker;

import com.bridgelabz.workshop2.code.MyLinkedList;

public class MyStack<T> {
    com.bridgelabz.workshop2.code.MyLinkedList<T> linkedList;

    public MyStack(){
        this.linkedList = new MyLinkedList<>();
    }

    public void push(T data){
        linkedList.pushElement(data);
    }

    public void display(){
        linkedList.displayElements();
    }

    public boolean search(T searchData){
        return linkedList.searchElement(searchData);
    }

}
