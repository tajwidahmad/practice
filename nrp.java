public class nrp {
    public static int non_repeat(int arr[]) {
  
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if (arr[i]==arr[j]) {
                    count++;
                    
                }

            }
            if (count==1) {
                return arr[i];
                
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,1,2,4,1};
        System.out.println(non_repeat(arr));
    }
}
