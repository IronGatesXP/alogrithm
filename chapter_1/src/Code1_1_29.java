/**
 * @author XP
 * @date 2018/7/8 22:58
 */
public class Code1_1_29 {
    // 如果有和key相等的值就只需要找到和key相等的、最左边的值的index，如果没有和key相等的值，就只需要返回low，当然前提是使用二分查找
    public static int countLower(int[] a, int key){
        int low = 0;
        int high = a.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(key < a[mid]){
                high = mid - 1;

            }else if(key > a[mid]){
                low = mid + 1;
            }else{
                while(mid > 0 && a[mid] == a[mid-1]){
                    mid--;
                }
                return mid;
            }
        }
        return low;
    }

    public static int countKey(int[] a, int key){
        int start = countLower(a,key);
        int count = 0;
        // 查找的数大于所有数的时候，start等于数组的长度，这时这个长度是超出数组下标的范围的
        if(start == a.length)
            return 0;
        while(a[start] == key){
            count++;
            start++;
        }
        return count;
    }
}
