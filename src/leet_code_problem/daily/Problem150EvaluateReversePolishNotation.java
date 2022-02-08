package leet_code_problem.daily;

import java.util.Stack;

public class Problem150EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a;
        int b;

        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if(tokens[i].equals("-")){
                a = stack.pop();
                b = stack.pop();
                stack.push(b - a);
            }
            else if(tokens[i].equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if(tokens[i].equals("/")){
                a = stack.pop();
                b = stack.pop();
                stack.push(b / a);
            }
            else{
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
