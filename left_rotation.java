public class left_rotation {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3
        ;
        rotated(arr, k);
        // print_lr(arr, k);

    }
    // public static void print_lr(int arr[],int k) {
    //     for(int i=1;i<=k;i++){
    //         int curr=arr[0];
    //         for(int j=0;j<arr.length-1;j++){
    //             arr[j]=arr[j+1];
    //         }
    //         arr[arr.length-1]=curr;

    //     }
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
        
    // }

    //########################## optimised approach {method-2} :--:=---
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
        reversing(arr, 0, arr.length-1);
        reversing(arr, 0, arr.length-k-1);
        reversing(arr, arr.length-k, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
