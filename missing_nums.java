public class missing_nums {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        pairs(arr);
        
    }
    public static void pairs(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int start=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+start+","+arr[j]+")");
            }
            System.out.println();
        }
        


        
    }
}