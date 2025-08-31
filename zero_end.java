public class zero_end {

    public static void main(String[] args) {
        int arr[]={1,0,2,3,0,4,0,1};
        end(arr);
        
    }
    public static void end(int arr[]) {
        int c_zero=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==0) {
                c_zero++;
                
            }
        }
        int temp[]= new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=0) {
                temp[j]=arr[i];
                j++;
                
            }
            
        }
        for(int i=arr.length-c_zero;i<temp.length;i++){
            temp[i]=0;
        }
        //printing the array
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
        
    }
}