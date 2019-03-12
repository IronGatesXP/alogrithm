package chapter_2;

import java.util.Stack;

/**
 * @author XP
 * @date 2018/8/14 16:05
 */
public class Code_1_3_11 {
    public static double evaluate(String s){
        String[] str = s.split(" ");
        Stack<Double> stack = new Stack<>();
        for(int i=0;i<str.length;i++){
             String s1 = str[i];
            if(s1.equals("+") ||s1.equals("-") || s1.equals("*") || s1.equals("/")){
                Double back = stack.pop();
                Double front = stack.pop();
                switch(s1){
                    case "+" : stack.push(front + back); System.out.println("分支1");break;
                    case "-" : stack.push(front - back);break;
                    case "*" : stack.push(front * back);break;
                    case "/" : stack.push(front / back);break;
                    default : System.out.println("出错");

                }

            }else{
//                System.out.println((double)c - (double)'0');
//                stack.push((double)c - (double)'0');
                stack.push(Double.valueOf(s1));
            }
        }
        return stack.peek();
    }
}
