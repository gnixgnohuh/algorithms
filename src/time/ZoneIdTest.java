package time;

import java.util.stream.Stream;

/**
 * @author: gnixgnohuh
 * @date : 18-3-7
 * @time : 上午11:09
 * @desc :
 */
public class ZoneIdTest {
    public static void main(String[] args) {
        Stream.of(1,2,3,4).reduce((a,i)->{
            System.out.println(a + "===" + i);
            return 0;
        });
    }
}
