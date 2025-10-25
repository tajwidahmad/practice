import java.util.*;
public class merge{
    public static void main(String[] args) {
        int arr[]={1,2,3,0,0,0};
        int arr2[]={2,5,6};
        for(int i=3,j=0;j<arr2.length;j++){
            arr[i]=arr2[j];
            i++;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}