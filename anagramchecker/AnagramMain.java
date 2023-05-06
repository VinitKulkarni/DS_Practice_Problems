package com.bridgelabz.datastructureprograms.anagramchecker;

//Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Stack using
//the Linked List and Print the Anagrams in the Reverse Order. Note no Collection
//Library can be used.
//create linkedlist (add or push) & display method

import com.bridgelabz.workshop2.code.MyStack;

public class AnagramMain {
    static void updateFreq(int n, int [] freq) //calculate freq of each digit of given number
    {
        // While there are digits left to process
        while (n > 0)
        {
            int digit = n % 10;

            // Update the frequency of the current digit
            freq[digit]++;

            // Remove the last digit
            n /= 10;
        }
    }

    static boolean areAnagrams(int a, int b) //checks for a and b are anagram or not
    {
        //To store the frequencies of the digits in a and b
        int [] freqA = new int[10];
        int [] freqB = new int[10];

        // Update the frequency of the digits in a
        updateFreq(a, freqA);

        // Update the frequency of the digits in b
        updateFreq(b, freqB);

        // Match the frequencies of the common digits
        for (int i = 0; i < 10; i++) {
            // If frequency differs for any digit then the numbers are not anagrams of each other
            if (freqA[i] != freqB[i])
                return false;
        }
        return true;
    }

    static void primeNumber(int arrayData[]) //prime number check and add it in simple array
    {
        int min = 0;
        int max = 1000;

        for(int value=min; value<=max; value++) {
            boolean flag = false;
            if (value == 0) {
                continue;
            }

            if (value == 1 || value == 2) {
                arrayData[value] = value;
                continue;
            }

            if (value >= 3) {
                for (int j = 2; j <= max / 2; j++) {
                    if (value % j == 0 && value != j) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag == false) {
                arrayData[value] = value;
            }
        }
    }

    public static void main(String[] args) {
        MyStack<Integer> stack1 = new MyStack();

        int arrayData[] = new int[1000];
        primeNumber(arrayData);


        for(int i=0; i< arrayData.length; i++){
            if(arrayData[i] != 0) {
                if (arrayData[i] != 0 && arrayData[i] > 9) {
                    int a = arrayData[i];
                    for(int j=i+1; j< arrayData.length; j++) {
                        if (arrayData[j] != 0 && arrayData[j] > 9) {
                            int b = arrayData[j];
                            if (areAnagrams(a, b))
                                System.out.println(a + " and " + b + " are anagrams.");
                                if(!stack1.search(a))
                                    stack1.push(a);
                        }
                    }
                }
            }
        }

        System.out.println("Elements of stack are:");
        stack1.display();
    }
}
