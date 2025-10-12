import java.util.*;
public class strings {
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(short_distance(str));
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter youe name :");
        // String name = sc.next();
        // System.out.println(name);
        // String str= "racecar";
        // // palindrome string
        // System.out.println(checkpalindrome(str));
        
        
        
        
    // }
    // public static boolean checkpalindrome(String str) {
    //     for(int i=0;i<str.length()/2;i++){
    //         if (str.charAt(i)!=str.charAt(str.length()-1-i)) {
    //             return false;
               
    //         }
    //     }
    //     return true;
    

    }
    public static float short_distance(String str) {
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)=='N'){
                y++;

                
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
        
    }
}
