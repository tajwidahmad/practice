public class largest {
    public static void main(String[] args) {
        String arr[]={"apple","mango","banana"};
        System.out.println(max(arr));

    }
    public static String max(String arr[]) {
        String max="";
        for(int i=0;i<arr.length;i++){
            if (arr[i].length()>max.length()) {
                max=arr[i];
                
            }
        }
        return max;
        
    }
    
}
