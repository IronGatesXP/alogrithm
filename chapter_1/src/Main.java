import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author XP
 * @date 2018/7/6 14:48
 */
public class Main {
    public static void main(String[] args){

        //int[] a = {1,2,3,4,4,5};
//        int a = StdIn.readInt();
//        int b = StdIn.readInt();
        // StdOut.println(Code1_1_26.selectSort(2,4,3));
//        long startTime1 = System.currentTimeMillis();
////        StdOut.println(Code1_1_19.F(40));
////        long startTime2 = System.currentTimeMillis();
////        StdOut.println("耗时： " + (startTime2 - startTime1));
////        long startTime3 = System.currentTimeMillis();
////        StdOut.println(Code1_1_19.fun(40));
////        long startTime4 = System.currentTimeMillis();
////        StdOut.println("耗时： " + (startTime4 - startTime3));
////        long startTime5 = System.currentTimeMillis();
////        StdOut.println(Code1_1_19.fun2(40));
////        long startTime6 = System.currentTimeMillis();
////        StdOut.println("耗时： " + (startTime6 - startTime5));


        double[] a = Code1_1_35.getTheroyDist();
        for(int i=0;i<a.length;i++){
            StdOut.print(a[i]);
        }
        StdOut.println();
        StdOut.println(Code1_1_35.getMatchN(1000));
    }
}
