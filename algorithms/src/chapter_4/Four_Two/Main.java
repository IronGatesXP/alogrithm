package chapter_4.Four_Two;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1024; i++) {
            String binaryString = Integer.toBinaryString(i);
            if (i % 32 == 0) {
                count++;
                for (int j = 0; j < 10 - binaryString.length(); j++) {
                    System.out.print("0");
                }
                System.out.println(Integer.toBinaryString(i) + " " + i);
                System.out.println("0000010000");
            }
        }
        System.out.println("count is " + count);
    }
}
