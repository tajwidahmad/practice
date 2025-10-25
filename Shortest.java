public class Shortest {
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(short_d(str));
    };
    public static float short_d(String str) {
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)=='N') {
                y++;
                
            }
            else if (str.charAt(i)=='S') {
                y--;
                
            }
            else if (str.charAt(i)=='E') {
                x++;
                
            }
            else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (int)Math.sqrt(x2+y2);
    }
}
