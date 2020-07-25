public class Test {
//    String res = "";
//    public long solution(long n){
//        res = "";
//        Long.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
//        return Long.parseLong(res);
//    }

    public boolean solution(int x) {
        boolean answer = true;
        char[] t = String.valueOf(x).toCharArray();

        int a = 0;
        for (int i = 0; i < t.length; i++) {
            a += t[i] - 48;
        }
        if(x % a != 0) answer = false;
        return answer;
    }

    public static void main(String[] args) {
        Test test = new Test();
        //System.out.println(test.solution(118372));
        test.solution(13);
    }
}
