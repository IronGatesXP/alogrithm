package chapter_2;

import java.util.Stack;

/**
 * @author XP
 * @date 2018/8/14 15:17
 */
public class Code1_3_10 {
    public static String mid2back(String s){
        String[] str = s.split(" ");
        for(String s1 : str){
            System.out.print(s1);
        }
        System.out.println();
        Stack<String> operatorStack = new Stack<>();
        String back = "";
        for(int i=0;i<str.length;i++){
            if(str[i].equals("(")){
                operatorStack.push(str[i]);
            }else if(str[i].equals(")")){
                String temp = operatorStack.peek();
                while(!temp.equals("(")){
                    //System.out.println(temp);
                    back = back + temp + " ";
                    //System.out.println(back);
                    operatorStack.pop();
                    temp = operatorStack.peek();
                }
                operatorStack.pop();
            }else if(str[i].equals("+") || str[i].equals("-") || str[i].equals("*") || str[i].equals("/")){
                while(!operatorStack.empty() && !operatorStack.peek().equals("(") && !isHigher(str[i],operatorStack.peek())){
                    back = back + operatorStack.pop() + " ";
                }
                operatorStack.push(str[i]);
            }else{
                back = back + str[i] + " ";
            }
        }
        while(!operatorStack.empty()){
            back = back + operatorStack.pop() + " ";
        }
        return back;
    }

    public static boolean isHigher(String in, String peek){
        if(in.equals("*") || in.equals("/")){
            if(peek.equals("+") || peek.equals("-")){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
