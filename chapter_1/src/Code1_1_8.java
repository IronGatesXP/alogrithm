import edu.princeton.cs.algs4.StdOut;

/**
 * @author XP
 * @date 2018/7/6 15:36
 */
public class Code1_1_8 {
    public static void toBinaryString(int N){
        String s = "";
        while(N != 0){
            s = N % 2 + s;
            N /= 2;
        }
        StdOut.println(s);
    }
}
