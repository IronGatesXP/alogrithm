import edu.princeton.cs.algs4.StdOut;

import java.security.SecureRandom;

/**
 * @author XP
 * @date 2018/7/6 15:41
 */
public class Code1_1_11 {
    public static void printArray(boolean[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j])
                    //StdOut.print("*");
                    StdOut.print("第"+i+"行"+"第"+j+"列"+"*");
                else
                    //StdOut.print(" ");
                    StdOut.print("第"+i+"行"+"第"+j+"列"+" ");
            }
            StdOut.println();
        }
    }
}
