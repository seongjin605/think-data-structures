package ci.chapter01;

public class _1_5 {
    /**
     * 문자열 삽입 삭제, 교체를 하기 위해 문자두개가 주어졌을때 편집회수가 1회 이내인지 체크
     *
     * 128개의 아스키코드가 주어진다고 가정하고,
     * value가 1이면 동일하지 않아 편집 대이상이다. 그래서 이 값을 카운트해서 1이 두개이상나오면 편집횟수가 2회이상이기 때문에 false를 리턴함.
     *
     * @param s
     * @param t
     * @return
     */
    static boolean isSatisfied(String s, String t) {
        if (s == null || "".equals(s) || t == null || "".equals(t)) throw new IllegalArgumentException();

        int[] letters = new int[128];

        for(char l : s.toCharArray()) {
            letters[l]++;
        }

        for(char l : t.toCharArray()) {
            letters[l]++;
        }

        int count = 0 ;
        for(int i = 0 ; i< letters.length; i++) {
            if(letters[i] == 1) count++;
            if(count > 2) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSatisfied("pale" ,"pale"));
        System.out.println(isSatisfied("pales" ,"pale"));
        System.out.println(isSatisfied("pale" ,"bale"));
        System.out.println(isSatisfied("pale" ,"bake"));
    }
}
