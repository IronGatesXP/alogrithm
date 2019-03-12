import edu.princeton.cs.algs4.StdOut;

/**
 * @author XP
 * @date 2018/7/9 17:04
 */
public class Matrix {
    public static double dot(double[] x, double[] y){
        if(x.length != y.length){
            System.exit(-1);
        }
        double sum = 0.0;
        for(int i=0;i<x.length;i++){
            sum += x[i] * y[i];
        }
        return sum;
    }

    public static double[][] mult(double[][] a, double[][] b){
        if(a[0].length != b.length){
            System.exit(-1);
        }
        int M = a.length;
        int N = b.length;
        double[][] c = new double[M][N];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                double sum = 0.0;
                for(int k=0;k<a[0].length;k++){
                    sum += a[i][k]*b[k][j];
                }
                c[i][j] = sum;
            }
        }
        return c;
    }

    public static double[][] transpose(double[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a[0].length;j++){
                double temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        return a;
    }

    public static double[] mult(double[][] a, double[] x){
        if(a[0].length != x.length){
            System.exit(-1);
        }
        double[] b = new double[a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                b[i] += a[i][j]*x[j];
            }
        }
        return b;
    }

    public static double[] mult(double[] y,double[][] a){
        if(y.length != a.length){
            System.exit(-1);
        }
        double[] b = new double[a[0].length];
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<a.length;j++){
                b[i] += a[j][i]*y[j];
            }
        }
        return b;
    }
}
