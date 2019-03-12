import edu.princeton.cs.algs4.StdOut;

/**
 * @author XP
 * @date 2018/7/9 16:32
 */
public class Code1_1_30 {
    public static int gcd(int p, int q){
        if(q == 0){
            return p;
        }
        int temp = p%q;
        return gcd(q,temp);
    }

    public static void matrix(int N){
        boolean[][] a = new boolean[N][N];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){

                    if(gcd(i,j) == 1){
                        a[i-1][j-1] = true;
                    }else{
                        a[i-1][j-1] = false;
                    }

            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                StdOut.printf("%6s",a[i][j]);
            }
            StdOut.println();
        }
    }
}
