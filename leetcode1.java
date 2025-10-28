public class leetcode1 {
    // element repeated maximum no. of times
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3};
        System.out.println(maxrepeatedele(arr));
    }
    public static int maxrepeatedele(int arr[]) {
        int count=1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==arr[i+1]) {
                count++;
                
            }
            if (count>2) {
                arr[i]=arr[i+1];
                
                
            }
        }
        return -1;
        
    }
    
    
}
