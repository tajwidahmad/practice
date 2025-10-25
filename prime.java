import java.util.*;
public class prime {
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     int num=sc.nextInt();
    //     // System.out.println(check(num));
    //     // printing the prime numbers in between 
    //     for(int i=2;i<num;i++){
    //         if (check(i)==true) {
    //             System.out.println(i);
                
    //         }
    //     }
        
        
        
    }
    public static boolean check(int num) {
        for(int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0) {
                return false;
                
            }
            
        }
       return true;
        
        
    }
}
