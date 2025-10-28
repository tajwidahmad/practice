import java.util.Arrays;
public class repeat {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,2,4,3};
        remove(arr);


    }
    public static void remove(int arr[]) {
        int temp[]={};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int count=1;
            while(i<arr.length-1 && arr[i]==arr[i+1]){
                count++;
                i++;
            }
            temp[i]=arr[i];
        }
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
        
    }

    
}