import java.util.Arrays;

public class strassi {
    // public static void main(String[] args) {
    //     String str="TaeojwidA";
    //     System.out.println(count(str));
    // }
    // public static int count(String str) {
    //     int count=0;
    //     for(int i=0;i<str.length();i++){
    //         char ch=str.charAt(i);
    //         if ((str.charAt(i)==Character.toLowerCase(ch))&&((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u'))) {
    //             count++;
            
    //         }
            
    //     }
    //     return count;
        
    // }

    public static void main(String[] args) {
        System.out.println(anagram("abcd", "cdab"));
        
    }
    public static boolean anagram(String str1,String str2) {
        // check for length;
        if (str1.length()!=str2.length()) {
            return false;
            
        }
        // if length is same
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
        
        
    }
   
    
}
