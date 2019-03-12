package chapter_1_4;


import java.util.Arrays;

/**
 * @author XP
 * @date 2018/9/2 13:38
 */
public class Code1_4_16 {
    public static void findClosestPair(double[] a){
        Arrays.sort(a);
        double min = Double.MAX_VALUE;
        int i = 0;
        for(int j=0;j<a.length-1;j++){
            if(a[j+1] - a[j] < min){
                i = j;
                min = a[j+1] - a[j];
            }
        }
        System.out.println("The closest is " + a[i] + "and" + a[i+1]);
    }
}
