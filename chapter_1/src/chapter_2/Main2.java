package chapter_2;

/**
 * @author XP
 * @date 2018/8/14 9:47
 */
public class Main2 {
    public static void main(String[] args){
//        // String s = "( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )";
//        String s = "10 * 3 / ( 2 - 1 ) + 3 * ( 4 - 1 )";
//        System.out.println(Code1_3_10.mid2back(s));
//        String str = Code1_3_10.mid2back(s);
//        System.out.println(Code_1_3_11.evaluate(str));
        int[] a = {1,3,6,2,7,9,4};
        // 1234679
        System.out.println(MiddleNum.findMidNum(a,a.length / 2));
    }
}
