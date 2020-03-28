package sort;

public class Test {
    public static void main(String[] args) throws Exception{
        long time1 = System.currentTimeMillis ();
        for(int i = 0; i < 1000000; i++) {
            //Thread.sleep(1000);
            System.out.println(i);
        }
        long time2 = System.currentTimeMillis ();
        System.out.println ( ( time2 - time1 ) / 1000.0 );
    }
}
