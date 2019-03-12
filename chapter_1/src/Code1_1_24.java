import edu.princeton.cs.algs4.StdOut;

/**
 * @author XP
 * @date 2018/7/8 14:22
 */
public class Code1_1_24 {
    public static int Euclid(int p, int q, int depth){
        StdOut.println("p is: " + p + ", q is: " + q + ", depth is: " + depth);
        if(q == 0)
            return p;
        int temp = p % q;
        return Euclid(q, temp, depth + 1);
    }
}
