public class left_rotation {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=4;
        print_lr(arr, k);

    }
    public static void print_lr(int arr[],int k) {
        for(int i=1;i<=k;i++){
            int curr=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=curr;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
