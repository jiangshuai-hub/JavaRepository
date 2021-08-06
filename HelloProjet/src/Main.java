import org.junit.Test;

import java.util.Arrays;


public class Main {

    @Test
    public void test() {

        System.out.println("Hello Github!");
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
