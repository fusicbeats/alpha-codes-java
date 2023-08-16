import java.util.*;
public class stack_JCFW {

    public static void pushAtBottom(Stack<Integer>s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    
    // Reverse a string using STACK   
    public static String  reverseString(String str){
        Stack<Character> s =new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            result.append(s.pop());
        }
       return result.toString();
    }

    public static void reverseStack(Stack<Integer>s){
        if(s.empty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // pushAtBottom(s, 4);
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }

        // String str = "abc";
        // System.out.println(reverseString(str));

        // Reverse a stack
        
        reverseStack(s);
        printStack(s);

    }
}

