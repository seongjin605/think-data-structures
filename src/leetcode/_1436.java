package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
 * Output: "Sao Paulo"
 */
public class _1436 {
    public static String destCity(List<List<String>> paths) {
        String result = null;
        for(int i = 0 ; i< paths.size(); i++) {
            for(int j = 0 ; j < paths.get(i).size(); j++) {
                result = paths.get(i).get(j);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
        List<List<String>> list = new ArrayList<>();

        List<String> a = new ArrayList<>();
        a.add("London");
        a.add("New york");
        list.add(a);

        List<String> b = new ArrayList<>();
        b.add("New york");
        b.add("Lima");
        list.add(b);

        List<String> c = new ArrayList<>();
        c.add("Lima");
        c.add("Sao Paulo");
        list.add(c);

        destCity(list);

    }
}
