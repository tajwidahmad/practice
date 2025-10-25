public class searching {
    public static int binser(int arr[],int key) {
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if (key>arr[mid]) {
                start=mid+1;
                
            }
            else if (key<arr[mid]) {
                end=mid-1;
                
            }
            if (key==arr[mid]) {
                return mid;
                
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int key=17;
        System.out.println(binser(arr, key));
    }
}
