package leetcode;

/**
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 */
public class Num1108 {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        Num1108 a = new Num1108();
        String address = a.defangIPaddr("1.1.1.1");
        System.out.println(address);
    }
}
