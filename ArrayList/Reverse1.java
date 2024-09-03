package ArrayList;
import java.util.*;

public class Reverse1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> list=new ArrayList<>();
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        } 

        //System.out.print(list.reversed());
        //System.out.print("\n"+list);

        
        for(int i=0;i<size/2;i++){
            int temp=list.get(i)+list.get(size-1-i);
            list.set(i,temp-list.get(i));
            list.set(size-1-i,temp-list.get(i));
        }

        System.out.print(list);

        sc.close();
    }
}
