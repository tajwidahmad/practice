public class nqt3 {
    public static void main(String[] args) {
        //swapping for reversing an array
        int arr[]={10,20,30,40,50};
        reverse(arr);

    }
    public static void reverse(int arr[]) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
