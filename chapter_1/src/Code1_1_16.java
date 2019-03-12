/**
 * @author XP
 * @date 2018/7/6 16:34
 */
public class Code1_1_16 {
    public static String exR1(int n){
        if(n<=0)
            return "";
        return exR1(n-3) + n + exR1(n-2) + n;
//        String s = exR1(n-3) + n + exR1(n-2) + n;
//        if(n<=0)
//            return "";
//        return s;
    }
}
