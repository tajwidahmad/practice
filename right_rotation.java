public class right_rotation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7};
        rotated(arr, 3);
    }

    public static void reversing(int arr[], int start , int end) {
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
        
    }
    public static void rotated(int arr[],int k) {
        int n = arr.length;
       

    reversing(arr, 0, n - 1);   // reverse whole array
    reversing(arr, 0, k - 1);   // reverse first k elements
    reversing(arr, k, n - 1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}