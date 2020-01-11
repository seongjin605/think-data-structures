package data.structure;

public class Test {

//    public void test(int val) {
//        val = 5;
//        System.out.println("함수 안에서 변경된 값 = " + val);
//    }
//
//    public static void main(String args[]) {
//        int i = 0;
//        Test ttt = new Test();
//        System.out.println("함수 콜하기 전에 값 = " + i);
//        ttt.test(i);
//        System.out.println("함수 콜하고 난 값 = " + i);
//    }

    public int i_val;

    public Test() {
        i_val = 0;
    }

    public void test(Test imsi) {
        imsi.i_val = 5;
        System.out.println("함수 안에서 변경된 값 = " + imsi.i_val);
    }

    public static void main(String args[]) {
        Test imsi = new Test();
        imsi.i_val = 0;

        Test ttt = new Test();
        System.out.println("함수 콜하기 전에 값 = " + imsi.i_val);

        ttt.test(imsi);
        System.out.println("함수 콜하고 난 값 = " + imsi.i_val);
    }
}
