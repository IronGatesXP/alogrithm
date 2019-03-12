import edu.princeton.cs.algs4.StdOut;

/**
 * @author XP
 * @date 2018/7/6 17:01
 */
public class Code1_1_19 {


        // Fibonacci数列计算，时间空间复杂度优化版
        private static int M = 100;
        private static long[] fib = new long[M];
        private static long[] fib2 = new long[M];
        public static long fibonacciOptimization(int N) {

            if(0 == N)
                fib[0] = 0;
            else if(1 == N)
                fib[1] = 1;
            else
                fib[N] = fib[N - 1] + fib[N -2];
            return fib[N];
        }

    public static long F(int N) {
        if(0 == N)
        {
            return 0;
        }
        else if(1 == N)
        {
            return 1;
        }
        else
        {
            //StdOut.println("没用数组迭代");
            return F(N - 1) + F(N - 2);
        }
    }

    public static long fun(int N) {
        if(0 == N)
        {
            fib[0] = 0;
            return 0;
        }
        else if(1 == N)
        {
            fib[1] = 1;
            return 1;
        }
        else
        {
            //StdOut.println("数组迭代");
            fib[N] = fun(N - 1) + fun(N -2);
        }
        return fib[N];
    }

    public static long fun2(int N) {
        if(0 == N)
        {
            fib2[0] = 0;
            return 0;
        }
        else if(1 == N)
        {
            if(fib2[N] == 0)
            {
                fib2[1] = 1;
                return 1;
            }
        }
        else
        {
            if(fib2[N] == 0)
            {
                //StdOut.println("数组迭代");
                fib2[N] = fun(N - 1) + fun(N -2);
            }
        }
        return fib2[N];
    }


        public static void main(String[] args) {
            for(int N = 0; N < 100; ++N) {
                fib[N] = fibonacciOptimization(N);
                StdOut.println(N + "\t" + fib[N]);
            }
        }

    }

