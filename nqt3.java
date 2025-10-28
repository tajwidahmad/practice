import java.util.Arrays;

public class nqt3 {
    public static void main(String[] args) {
        int arr[]={102,1000,908,999};
        System.out.println(second_largest(arr));

    }
    public static int second_largest(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length-2];
        
    }
}
