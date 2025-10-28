public class nqt1 {
    public static void main(String[] args) {
        int arr[]={2,5,1,3,0};
        int min=Integer.MAX_VALUE;
        System.out.println(minele(arr, min));
    }
    public static int minele(int arr[],int min) {
        for(int i=0;i<arr.length;i++){
            if (arr[i]<min) {
                min=arr[i];
                
            }
        }
        return min;
        
    }
}
