public class ones {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,1,1};
        System.out.println(cones_one(arr));
    }
    public static int cones_one(int arr[]) {
        int max=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==1) {
                count++;
                if (count>max) {
                    max=count;
                }
                
            }
            else {
                count=0;
            }
        }
        return max;
    }
}
