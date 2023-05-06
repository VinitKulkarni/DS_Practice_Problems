package com.bridgelabz.datastructureprograms.unorderedlist;

//data structure programs
//1. UnOrdered List

public class UnorderedListMain {
    public static void main(String[] args) {
        String sentense = "The Data Structure Using Java";

        String word[] = sentense.split(" ");
        System.out.println("length="+word.length);

        LinkedList<String> linkedList = new LinkedList<>();

        for(int i=0; i<word.length; i++){
            //System.out.println(word[i]);
            linkedList.push(word[i]);//inserting elements into linked list
        }
        linkedList.display();//list of words are displayed

        linkedList.searchElement("Programming");//data is not,insert
        linkedList.display();//list of words are displayed


        linkedList.searchElement("Using");//data is found, delete
        linkedList.display();//list of words are displayed

        linkedList.searchElement("Java");//data is found, delete
        linkedList.display();//list of words are displayed

        linkedList.searchElement("The");//data is found, delete
        linkedList.display();//list of words are displayed

        linkedList.searchElement("Programming");//data is found, delete
        linkedList.display();//list of words are displayed

        linkedList.searchElement("Structure");//data is found, delete
        linkedList.display();//list of words are displayed

        linkedList.searchElement("Data");//data is found, delete
        linkedList.display();//list of words are displayed

        linkedList.searchElement("Data");//data is found, delete
        linkedList.display();
    }
}
