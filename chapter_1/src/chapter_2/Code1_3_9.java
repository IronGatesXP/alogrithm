package chapter_2;

import java.util.Stack;

/**
 * @author XP
 * @date 2018/8/14 10:29
 */
public class Code1_3_9 {
    public static void addOpt(String s){
        // 参数s必须以空格隔开
        Stack<String> stackDigit = new Stack<>();
        Stack<String> stackOpt = new Stack<>();
        String[] sa = s.split(" ");
        for(String str : sa){
            System.out.print(str);
        }
        System.out.println();
        for(int i=0;i<sa.length;i++){
            if(sa[i].equals("+")  ||sa[i].equals("-") || sa[i].equals("*") || sa[i].equals("/")){
                stackOpt.push(sa[i]);
            }else if(sa[i].equals(")")){
                String back = stackDigit.pop();
                String front = stackDigit.pop();
                String temp = "(" + front + stackOpt.pop() + back + ")";
                stackDigit.push(temp);
            }else{
                stackDigit.push(sa[i]);
            }
        }
        System.out.println(stackDigit.peek());
    }


}
