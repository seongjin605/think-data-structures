package hackerrank;

import java.util.Scanner;

public class Test {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();

        for(int i = 0; i< 100; i++) {
            Thread.sleep(1000);
        }
        long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
        System.out.println( "실행 시간 : " + ( end - start ) / 1000.0 +"초");

    }
}
