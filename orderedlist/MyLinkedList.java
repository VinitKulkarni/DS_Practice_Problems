package com.bridgelabz.datastructureprograms.orderedlist;


public class MyLinkedList<T extends Comparable<T>> {
    Node<T> head;
    Node<T> tail;

    public void sortAndPush(T data)  {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }

        //sorting start here
        Node<T> current = head, index;
        T temp;
        if(head != null){
            while(current != null){
                index = current.next;
                while (index != null) {
                    if ((current.data.compareTo(index.data)) > 0) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }


    public void display() {
        if(calculateSize() > 0) {
            System.out.print("Elements are: ");
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println();
        }else{
            System.out.println("Linked list is empty. Cannot Display");
        }
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

    public void searchElement(T searchData){
        Node<T> temp = head;
        boolean flag = false;
        while(temp != null){
            if(temp.data.equals(searchData)){
                flag = true;
                break;
            }else{
                flag = false;
            }
            temp = temp.next;
        }
        if(flag == false){
            System.out.println(searchData + " not found. Inserting new data");
            sortAndPush(searchData);
        }else{
            System.out.println(searchData + " is found & deleted");
            deleteElement(searchData);
        }
    }

    public void deleteElement(T searchData){
        Node<T> temp = head;
        Node<T> prev = null;
        boolean flag = false;
        if(head == tail && head != null){
            head = null;
            tail = null;
            return;
        }
        if(head.data.equals(searchData)){
            //if search data in head(Start)
            head = head.next;
            return;
        }
        if(tail.data.equals(searchData)){
            //if search data in tail(end)
            Node<T> current = head;
            Node<T> hold = null;
            while(current.next != null){
                hold = current;
                current = current.next;
            }
            tail = hold;
            tail.next = null;
            return;
        }
        while(temp != null) {
            if (temp.data.equals(searchData)) {
                //removing code
                prev.next = temp.next;
                temp = null;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
    }
}
