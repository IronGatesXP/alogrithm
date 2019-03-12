package chapter_2;

import java.util.Stack;

/**
 * @author XP
 * @date 2018/8/9 17:33
 */
public class Code1_3_4 {
    public static boolean parentheses(String s){
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i] == '('){
                stack.push(')');
            }else if(c[i] == '{'){
                stack.push('}');
            }else if(c[i] == '['){
                stack.push(']');
            }else{
                if(!stack.empty()){
                    char temp = stack.peek();
                    if(temp == c[i]){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }

        }
        return stack.empty();
    }
}
