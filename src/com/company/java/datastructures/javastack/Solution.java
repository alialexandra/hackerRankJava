package com.company.java.datastructures.javastack;

import java.util.*;
class Solution{


    // Function to check if the given string is balanced
    public static boolean isBalanced(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        // Iterate through each character in the string
        for (char ch : s.toCharArray()) {
            // If it's an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If it's a closing bracket, check for a match
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If stack is empty or the top of the stack doesn't match, it's unbalanced
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        // If the stack is empty at the end, it's balanced
        return stack.isEmpty();
    }

    // Function to check if opening and closing brackets match
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            System.out.println(isBalanced(input)? "true": "false");
        }

    }
}
