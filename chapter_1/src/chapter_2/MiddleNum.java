package chapter_2;

/**
 * @author XP
 * @date 2018/11/7 22:08
 */
public class MiddleNum {
    private static int partition(int[] a, int lo, int hi) {
        int i =lo;
        int j = hi;
        int key = a[lo];
        while (i < j) {
            // 采用这种判断方式的话，条件一定要是<=，因为第一次判断a[i]与key的大小时他俩是相等的，如果没有等号会把key和第一个小于key的值交换。
            while (a[i] <= key && i < j) {
                i++;
            }
            while (a[j] > key && i < j) {
                j--;
            }
            // 作用是减少不必要的交换操作
            if (i < j) {
                exchange(a, i, j);
            }
        }
        exchange(a, lo, i);
        return i;
    }

    private static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int findMidNum(int[] a, int k) {
        int lo = 0;
        int hi = a.length-1;
        while (lo < hi) {
            int i = partition(a, lo, hi);
            if (i == k) {
                return a[k];
            }
            if (i > k) {
                hi = i -1;
            }
            if (i < k) {
                lo = i + 1;
            }
        }
        return a[k];
    }
}
