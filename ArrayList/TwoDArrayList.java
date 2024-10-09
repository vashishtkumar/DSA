package ArrayList;
import java.util.*;
public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> list=new ArrayList<>();

        for(int i=0;i<3;i++){
            ArrayList <Integer> li=new ArrayList<>();
            for(int J=0;J<3;J++){
            li.add(i);
            }
            list.add(li);
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
         System.out.print(list.get(i).get(j)+" ");
            }
System.out.println();
        }
    }
}
