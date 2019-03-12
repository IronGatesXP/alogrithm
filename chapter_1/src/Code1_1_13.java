import edu.princeton.cs.algs4.StdOut;

/**
 * @author XP
 * @date 2018/7/6 16:01
 */
public class Code1_1_13 {
    public static void reverseMatrix(int[][] a){
        int M = a.length;
        int N = a[0].length;
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                StdOut.print(a[i][j]);
            }
            StdOut.println();
        }

        for(int i=0;i<M;i++){
            for(int j=i;j<N;j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        StdOut.println("reverseMatrix");
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                StdOut.print(a[i][j]);
            }
            StdOut.println();
        }

    }
}
