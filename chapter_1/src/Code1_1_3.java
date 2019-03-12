import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author XP
 * @date 2018/7/6 15:00
 */
public class Code1_1_3 {
    public static void equals(){
        StdOut.println("Enter three numbers");
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        if(a==b && b==c){
            StdOut.println("equal");
        }
        else{
            StdOut.println("not equal");
        }
    }
}
