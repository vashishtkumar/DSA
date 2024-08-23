import java.util.*;

public class palindrome {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    for(int i=0;i<str.length()/2;i++){
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
        System.out.println("Not a palindrome");
        sc.close();
        return;
        }
    }
    System.out.println("palindrome");
       sc.close();
}
}