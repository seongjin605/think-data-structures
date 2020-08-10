import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            if(deque.size() == m) {
                while(!deque.isEmpty()) {
                    set.add((Integer) deque.remove());
                }
                if(set.size() > max)
                    max = set.size();
            }
        }
        System.out.println(max);
    }
}
