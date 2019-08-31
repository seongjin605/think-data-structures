public class DefangIPaddr {
    /**
     * <a>https://leetcode.com/problems/defanging-an-ip-address/</a>
     * Input: address = "1.1.1.1"
     * Output: "1[.]1[.]1[.]1"
     *
     * @param address
     * @return
     */
    public static String defangIPaddr(String address) {
        String[] aList = address.split("\\.");
        return String.join("[.]", aList);
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";
        String result = defangIPaddr(address);
        System.out.println(result);
    }
}
