public class second_largest {
    public static void main(String[] args) {
        int[] arr={8,8,8,8,8,8};
        System.out.println(second_largest(arr));
        // System.out.println(largest(arr));

    }
    public static int largest(int[] arr) {
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>largest) {
                largest=arr[i];
                
                
            }
            return largest;
            

        }
        return -1;
        
    }
//     public static int second_largest(int[] arr) {
        
//         int big = largest(arr);
// int second = Integer.MIN_VALUE;

// for (int i = 0; i < arr.length; i++) {
//     if (arr[i] > second && arr[i] != big) {
//         second = arr[i];
//     }
// }

// // If second is still MIN_VALUE, means no second largest found
// if (second == Integer.MIN_VALUE) {
//     return -1;
// }

// return second;

       
       
        
    // }

    public static int second_largest(int[] arr) {
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>second && arr[i]!=largest(arr)) {
                second=arr[i];
            }
            

        }
        if (second==Integer.MIN_VALUE) {
            return -1;
    }
        return second;
        
    }

}
