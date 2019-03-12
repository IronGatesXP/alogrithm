package chapter_1_4;

/**
 * @author XP
 * @date 2018/9/2 14:52
 */
public class Code1_4_18 {
    public static int localMinimum(int[] x) {
        if (x == null || x.length == 0) {
            return -1;
        }
        if (x.length == 1 && x[0] < x[1]) {
            System.out.println("is0");
            return 0;
        }
        if (x[x.length - 1] < x[x.length - 2]) {
            return x.length - 1;
        }

        int mid = 0;
        int left = 1;
        int right = x.length - 2;
        while (left < right) {
            mid = (left + right) / 2;
            if (x[mid - 1] < x[mid]) {
                right = mid - 1;
            } else if (x[mid + 1] < x[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }

    public static int findLocalMinima(int arr[],int start, int end){
        int mid = (start + end) / 2;
        if (mid - 2 < 0 && mid + 1 >= arr.length)
            return -1;//已知a[0]>=a[1] 并且 a[n]>=a[n-1]
        if (arr[mid - 2] > arr[mid - 1] && arr[mid - 1] < arr[mid])
            return arr[mid - 1];
        if (arr[mid - 1] > arr[mid - 2])
            return findLocalMinima(arr, start, mid);
        else
            return findLocalMinima(arr, mid, end);
    }

    public static int findLocalMin(int a[], int left, int right){
        if(a == null || a.length ==0)
            return -1;
        int mid  = (left + right)/2;
        if(mid == 0){
            return mid;
        }
        if(mid == a.length-2){
            return mid +1;
        }
        if(a[mid] < a[mid-1] && a[mid] < a[mid+1]){
            return mid;
        }else{
            if(a[mid-1]<a[mid+1]){
                return findLocalMin(a,left,mid);
            }else{
                return findLocalMin(a,mid,right);
            }
        }
    }
}
