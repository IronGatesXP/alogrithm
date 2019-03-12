import edu.princeton.cs.algs4.StdOut;

/**
 * @author XP
 * @date 2018/7/8 14:01
 */
public class Code1_1_22 {
    public static int binarySearch(int key, int[] a,int low, int high){
        StdOut.println("low is : " + low + " and high is : " + high);
        if(low>high)
            return -1;
        int mid = low + (high - low)/2;
        if(a[mid] > key)
        {
            return binarySearch(key,a,low,mid - 1);
        }
        else if(a[mid] < key)
        {
            return binarySearch(key,a,mid+1,high);
        }
        else
        {
            return mid;
        }
    }
}
