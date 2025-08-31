public class check_for_sorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(check(arr));
    }
    public static boolean check(int[] arr) {
        for(int i=1;i<arr.length;i++){
            if (arr[i]<arr[i-1]) {//ascending order.....
                return false;
                
            }
            
        }
        return true;
        
    }
}
