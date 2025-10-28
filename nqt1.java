import java.util.Arrays;

public class nqt1 {
    public static void main(String[] args) {
        int arr[]={8,10,5,7,9};
        System.out.println(min_ele(arr));
        // int min=Integer.MAX_VALUE;
        // System.out.println(minele(arr, min));

    }
    // public static int minele(int arr[],int min) {
    //     for(int i=0;i<arr.length;i++){
    //         if (arr[i]<min) {
    //             min=arr[i];
                
    //         }
    //     }
    //     return min;
        
    // }
    public static int min_ele(int arr[]) {
        Arrays.sort(arr);
        return arr[0];
        
    }
    
}
