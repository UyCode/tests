package com.uycode;

import java.util.Stack;

public class Test {

    public static void main(String[] args) {
        System.out.println(args[0]);
        boolean result = isValidBracket("");
        System.out.println(result);

    }

    public static boolean isValidBracket(String str){
        Stack<Character> stack = new Stack<>();
        int len = str.length();
        char[] brackets = str.toCharArray();
        char temp='0';
        if(str.isEmpty())
            return true;

        stack.add(brackets[0]);
        for(int i = 1; i < len; i++){
            if(!stack.isEmpty())
                temp = stack.peek();
            stack.add(brackets[i]);
            if(temp == '(' && stack.peek() == ')'){
                stack.pop();
                stack.pop();
            }else if(temp == '[' && stack.peek() == ']'){
                stack.pop();
                stack.pop();
            }else if(temp == '{' && stack.peek() == '}'){
                stack.pop();
                stack.pop();
            }
        }
        if(stack.isEmpty())
            return true;

        return false;
    }

}
