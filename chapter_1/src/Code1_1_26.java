import edu.princeton.cs.algs4.StdOut;

/**
 * @author XP
 * @date 2018/7/8 14:35
 */
public class Code1_1_26 {
    public static void selectSort(int a, int b, int c){
        if(a > b){
            int t = a;
            a = b;
            b = t;
        }
        if(a > c){
            int t = a;
            a = c;
            c = t;
        }
        if(b > c){
            int t = b;
            b = c;
            c = t;
        }
        StdOut.println(a + "、" + b + "、" + c);
    }

    public static void maopaoSort(int a, int b, int c){
        if(a > b){
            int t = a;
            a = b;
            b = t;
        }
        if(b > c){
            int t = b;
            b = c;
            c = t;
        }
        if(a > b){
            int t = a;
            a = b;
            b = t;
        }
        StdOut.println(a + "、" + b + "、" + c);
    }
}
