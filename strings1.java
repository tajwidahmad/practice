public class strings1 {
    // public static void main(String[] args) {
    //     String name="tajwid";
    //     String str=new String("ahamd");

    //     if(name==str){
    //         System.out.println("same");
    //     }
    // }

    public static void main(String[] args) {
        // if palindrome 
        String str="madam";
        System.out.println(check_palin(str));

    }
    public static boolean check_palin(String str) {
        int start=0;
        int last=str.length()-1;
        while(start<last){
            if (str.charAt(start)!=str.charAt(last)) {
                return false;
                
            }
            start++;
            last--;


        }
        return true;
        
    }
}
