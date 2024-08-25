import java.util.*;
public class ConvertEachFirstLetterInUpeerCase {

    public static String ConvertUperCase(String str){
          StringBuilder str1=new StringBuilder("");
          char ch=Character.toUpperCase(str.charAt(0));
          str1.append(ch);
          for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i < str.length()-1){
                str1.append(' ');
                i++;
            str1.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            str1.append(str.charAt(i));
        }
        return str1.toString();

          }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       System.err.println(ConvertUperCase(str));
       sc.close();
    }
}
