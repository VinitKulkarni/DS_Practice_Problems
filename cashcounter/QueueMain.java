package com.bridgelabz.datastructureprograms.cashcounter;


//data structure program
//4. Simulate Banking Cash Counter(using queue)

public class QueueMain {

    public static void main(String[] args) {
        MyQueue<String> queue2 = new MyQueue();
        queue2.enqueue("Akshay");
        queue2.enqueue("Rani");
        queue2.enqueue("Vinit");
        queue2.enqueue("Raam");
        queue2.printQueue();

        queue2.startProcessingQueue();
    }
}
