package chapter_1_4;

import edu.princeton.cs.algs4.BinarySearch;

import java.util.Arrays;

/**
 * @author XP
 * @date 2018/8/30 20:24
 */
public class ThreeSumFaster {
    public static void threeSum(int[] a){
        Arrays.sort(a);
        int count = 0;
        int N = a.length;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int k=j+1;k<N;k++){
                    if(a[i]+a[j]+a[k] == 0){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void threeSumFaster(int[] a){
        Arrays.sort(a);
        int count = 0;
        int N = a.length;
        for(int i=0;i<N;i++){
            int left = i + 1;
            int right = N - 1;
            while(left<right){
                if(a[i]+a[left]+a[right]==0){
                    count++;
                    left++;
                }
                if(a[i]+a[left]+a[right]>0){
                    right--;
                }
                if(a[i]+a[left]+a[right]<0){
                    left++;
                }
            }
        }
        System.out.println(count);
    }

    public static void threeSumByBinarySearch(int[] a){
        Arrays.sort(a);
        int N = a.length;
        int count = 0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(BinarySearch.indexOf(a,-a[i]-a[j]) >j){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
