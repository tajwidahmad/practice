import java.util.*;
public class missing_nums {
    public static void main(String[] args) {
        int arr[]= new int[5];
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the elements of the array one by one: ");
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
        System.out.print("enter the key you want to search: ");
        int key=sc.nextInt(); 
        // System.out.println(l_serach(arr, key));   
        // System.out.println(largest(arr)); 
    }
    public static int l_serach(int  arr[], int key) {
        for(int i=0;i<arr.length;i++){
            if (arr[i]==key) {
                System.out.print("the key is present in the array at an index: ");
                return i; 
            }
        }
        return -1;
        
    }
    public static int largest(int arr[]) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>largest) {
                largest=arr[i];
                
            }
        }
        return largest;
        
    }
    
}
