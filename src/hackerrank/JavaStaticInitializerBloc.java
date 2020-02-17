package hackerrank;

import java.util.Scanner;

public class JavaStaticInitializerBloc {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int breadth = sc.nextInt();
        int height = sc.nextInt();
        int width = 0;
        width = breadth * height;
        System.out.println(width);
        if (width < 0) {
            throw new Exception("Breadth and height must be positive");
        }
    }
}
