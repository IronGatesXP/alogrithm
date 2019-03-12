import edu.princeton.cs.algs4.StdOut;

/**
 * @author XP
 * @date 2018/7/6 15:20
 */
public class Code1_1_7 {
    public static void sqrt(){
        double t  = 9.0;
        while(Math.abs(t - 9.0/t) > .001){
            t = (9.0/t + t)/2.0;
        }
        StdOut.printf("%.5f\n",t);
    }
}
