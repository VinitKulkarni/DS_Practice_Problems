package com.bridgelabz.datastructureprograms.balanceparanthesis;

//data structure programs
//3. Simple Balanced Parentheses(using stack)
public class StackMain {
    public static void main(String[] args) {
        String expression = "([])";
        MyStack<String> stack = new MyStack<>();

        boolean result = stack.areBracketsBalanced(expression);
        if(result){
            System.out.println("Paranthesis Balanced");
        }else {
            System.out.println("Paranthesis Not Balanced");
        }
    }
}
