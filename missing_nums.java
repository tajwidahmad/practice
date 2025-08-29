import java.util.Arrays;

public class missing_nums {

    public static void main(String[] args) {
        int arr[]={2,4,3,5,7};
        int key = 5;
        System.out.println(bin_s(arr, key));

    }
    public static int bin_s(int arr[],int key) {
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
       
        while(start<=end){
             int mid=(start+end)/2;
            // if key==mid
            if (key==arr[mid]) {
                return mid;
                
            }
            else if(key>arr[mid]){
                start=mid+1;

            }
            else{
            end=mid-1;
            start++;
            end--;
            }
        }
        return -1;

        
    }
}