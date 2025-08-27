public class kadanes {
    public static int sub_sum(int arr[]) {
        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i=0;i<arr.length;i++){
            curr_sum+=arr[i];
            if (curr_sum<0) {
                curr_sum=0;
                
            }
            max_sum=Math.max(curr_sum, max_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[]={-2,-5,6,-2,-3,1,5,-6};
        System.out.println(sub_sum(arr));
    }
}
