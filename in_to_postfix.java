import java.util.*;
import java.io.*;
public class in_to_postfix {

    public static int prec(char  c){
        if(c=='^'){
            return 3;
        }else if(c=='*'|| c=='/'){
            return 2;
        }else if(c=='+'|| c=='-'){
            return 1;
        }
        return -1;
    }

    public static String infixtoPostfix(String s){
        Stack<Character> st = new Stack<>();

        String res="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
                res=res+(s.charAt(i));
            }
            else if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                while(!st.isEmpty() && st.peek()!= '(' ){
                    res+=st.peek();
                    st.pop();
                }
                st.pop();
            }else{
                while(!s.isEmpty() && prec(s.charAt(i))<=prec(st.peek())){
                    res+=st.peek();
                    st.pop();
                }
                st.push(s.charAt(i));
            }
        }

        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
    public static void main(String args[]){
        System.out.println(infixtoPostfix("(a+b)"));
    }
}
