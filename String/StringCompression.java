/**
 * StringCompression
 */
public class StringCompression {
    public static String Compression(String str){
        StringBuilder str1=new StringBuilder("");
        int cnt;
        for(int i=0;i<str.length();){
            cnt=0;
            char ch=str.charAt(i);
            str1.append(str.charAt(i++));
            cnt++;
            while(i<=str.length()-1 && str.charAt(i)==ch){
                cnt++;
                i++;
            }
            str1.append(cnt);
        }
        return str1.toString();
    }

    public static void main(String[] args) {
        String str="aaabbbccdd";
        System.out.println(Compression(str));
    }
}
