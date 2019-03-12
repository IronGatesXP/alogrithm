import edu.princeton.cs.algs4.StdRandom;

/**
 * @author XP
 * @date 2018/7/9 22:49
 */
public class Code1_1_36 {
    public static void shuffle(int[] a){
        int N = a.length;
        for(int i=0;i<N;i++){
            int r = i + StdRandom.uniform(N-i);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static int[] getArray(int M){
        int[] before = new int[M];
        for(int i=0;i<M;i++){
            before[i] = i;
        }
        return before;
    }

    public static int[] getShuffleArray(int M){
        for(int i=0;i<M;i++){

        }
        int[] before = getArray(M);
        shuffle(before);
        int[] after = before;
        return after;
    }

    public static void shuffleTest(int M, int N){
        int[][] a = new int[M][M];


    }
}
