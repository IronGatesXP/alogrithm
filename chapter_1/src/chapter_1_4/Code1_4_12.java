package chapter_1_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author XP
 * @date 2018/8/30 16:06
 */
public class Code1_4_12 {
    public static void printSameInArray(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int ai = 0;
        int bi = 0;
        int len = a.length + b.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<len;i++){
            if(a[ai]<b[bi]){
                ai++;
                if(ai==a.length){
                    break;
                }
            }else if(a[ai]>b[bi]){
                bi++;
                if(bi==b.length){
                    break;
                }
            }else{
                System.out.println("不过滤相同元素" + a[ai]);
                // 如果要求不能输出相同的元素
                if(!list.contains(a[ai])){
                    list.add(a[ai]);
                }
                ai++;
                bi++;
                if(ai==a.length || bi==b.length){
                    break;
                }
            }
        }

        System.out.println("过滤相同元素：");
        for(int i : list){
            System.out.println(i);
        }
    }
}
