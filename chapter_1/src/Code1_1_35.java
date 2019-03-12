import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * @author XP
 * @date 2018/7/9 21:35
 */
public class Code1_1_35 {
    public static double[] getTheroyDist(){
        int SIDES = 6;
        double[] theroyDist = new double[2*SIDES+1];
        for(int i=1;i<=SIDES;i++){
            for(int j=1;j<=SIDES;j++){
                theroyDist[i+j] += 1.0;
            }
        }
        for(int i=2;i<=12;i++){
            theroyDist[i] /= 36;
        }
        return theroyDist;
    }

    public static double[] getRealDist(int N){
        double[] realDist = new double[13];
        for(int i=0;i<N;i++){
            int a = StdRandom.uniform(1,7);
            int b = StdRandom.uniform(1,7);
            realDist[a+b] += 1.0;
        }
        for(int i=2;i<=12;i++){
            realDist[i] /= N;
        }
        return realDist;
    }

    public static boolean judge(double[] theroyDist, double[] realDist){
        for(int i=2;i<=12;i++){
            // 如果选取判断标准为0.001 还是会匹配到小数点后两位，但对应的两个数的差值的绝对值确实满足小于0.001 如.13888888888888890和.139122
            if(Math.abs(theroyDist[i] - realDist[i]) >= 0.0001){
                return false;
            }
        }
        return true;
    }

    public static int getMatchN(int N){
        double[] theroyDist = getTheroyDist();
        boolean match = false;
        while(!match){
            double[] realDist = getRealDist(N);
            match = judge(theroyDist,realDist);
            System.out.println(match+"");
            System.out.println(Arrays.toString(realDist));
            if(!match){

                N *= 10;
            }
        }
        return N;
    }
}
