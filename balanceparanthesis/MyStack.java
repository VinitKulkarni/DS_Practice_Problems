package com.bridgelabz.datastructureprograms.balanceparanthesis;

public class MyStack<T> {
    MyLinkedList linkedList;
    public MyStack(){
        this.linkedList = new MyLinkedList();
    }

    boolean areBracketsBalanced(String expValue)
    {
        for (int i = 0; i < expValue.length(); i++) {
            Character x = expValue.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                T data = (T) x;
                push(data);
                continue;
            }


            char check;
            switch (x) {
                case ')':
                    check = pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return true;
    }

    public void push(T data) {
        linkedList.add(data);
        System.out.println(data + " is pushed in stack");
    }

    public void peak() {
        if(linkedList.calculateSize() > 0){
            System.out.print("Top of Stack is: ");
            linkedList.showTail();
        }else {
            System.out.println("Stack is empty.Cannot display Top of stack");
        }
    }

    public char pop() {
        char poppedData = '\u0000';
        if(linkedList.calculateSize() > 0){
            System.out.print("Popped element from stack is: ");
            poppedData = (char) linkedList.deleteLast();
            System.out.println(poppedData);
        }else {
            System.out.println("Stack is empty.Cannot pop element");
        }
        return poppedData;
    }

    public void printStack() {
        if(linkedList.calculateSize() > 0) {
            System.out.print("Stack elements are: ");
            linkedList.display();
        }else{
            System.out.println("Stack is empty.Cannot display element");
        }
    }
}
