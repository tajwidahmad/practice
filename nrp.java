public class nrp {
    public static int non_repeat(int arr[]) {
  
        // for(int i=0;i<arr.length;i++){
        //     int count=0;
        //     for(int j=0;j<arr.length;j++){
        //         if (arr[i]==arr[j]) {
        //             count++;
                    
        //         }

        //     }
        //     if (count==1) {
        //         return arr[i];
                
        //     }
        // }
        // return -1;
        int non_repeated=arr[0];
        for(int i=1;i<arr.length;i++){
            non_repeated=non_repeated ^ arr[i];
        }
        return non_repeated;



        
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,7,1,4,4};
        // System.out.println(non_repeat(arr));
        System.out.println(non_repeat(arr));
    }
}
