package com.bridgelabz.datastructureprograms.palindromchecker;

import java.util.Scanner;

//data structure programs
//5.Palindrome-Checker
public class QueueMain {
    public static void main(String[] args) {
        MyQueue<Character> queue1 = new MyQueue<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String originalString = sc.next();


        //inserting elements into queue
        int index = 0;
        while(originalString.length() != index) {
            queue1.enqueue(originalString.charAt(index));
            index++;
        }

        //displaying queue elements and head & tail
        queue1.printQueue();
        queue1.pointerValue();


        //removing queue elements which is added last & so on..
        int queueSize = -1;
        String reverseData = "";
        while(queueSize != 0){
            reverseData = reverseData + queue1.dequeue();
            queueSize = queue1.queueSize();
        }

        System.out.println();
        if(originalString.equals(reverseData)){
            System.out.println("STRINGS ARE PALINDROME");
        }else{
            System.out.println("STRINGS ARE NOT PALINDROME");
        }
    }
}
