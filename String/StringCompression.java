/**
 * StringCompression
 */
public class StringCompression {
    public static String Compression(String str){
        String str1="";
        int cnt;
        for(int i=0;i<str.length();){
            cnt=0;
            char ch=str.charAt(i++);
            str1+=ch;
            cnt++;
            while(i<=str.length()-1 && str.charAt(i)==ch){
                cnt++;
                i++;
            }
            str1+=cnt;
        }
        return str1;
    }

    public static void main(String[] args) {
        String str="aaabbbccdd";
        System.out.println(Compression(str));
    }
}
