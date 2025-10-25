public class substr {
    public static void main(String[] args) {
        String str="tajwid_ahmad";
        System.out.println(subString(str, 0, 3));


    }
    public static String subString(String str,int si,int ei) {
        String subs="";
        for(int i=si;i<=ei;i++){
            subs+=str.charAt(i);
        }
        return subs;
        
    }
}
