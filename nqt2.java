import java.util.Arrays;
import java.util.Collections;

public class nqt2 {
    public static void main(String[] args) {
        Integer arr[]={2,3,1,0,8};
        System.out.println(max_ele(arr));

    }
    public static int max_ele(Integer arr[]) {
        Arrays.sort(arr,Collections.reverseOrder());
        return arr[0];
    }
}
