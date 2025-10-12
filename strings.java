import java.util.*;
public class strings {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter youe name :");
        // String name = sc.next();
        // System.out.println(name);
        String str= "racecar";
        // palindrome string
        System.out.println(checkpalindrome(str));
        
        
        
        
    }
    public static boolean checkpalindrome(String str) {
        for(int i=0;i<str.length()/2;i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)) {
                return false;
               
            }
        }
        return true;
    }
}
