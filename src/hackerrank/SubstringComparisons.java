package hackerrank;

public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for (int i = 0; i <= s.length() - k; i++) {
            String str = s.substring(i, i + k);
            if (smallest == "" || str.compareTo(smallest) < 0) smallest = str;
            if (largest == "" || str.compareTo(largest) > 0) largest = str;

        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        getSmallestAndLargest("welcometojava", 3);
    }
}
