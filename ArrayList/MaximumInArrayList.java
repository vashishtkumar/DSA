package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumInArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>(16);
        list.add(78);
        list.add(56);
        list.add(34);
        list.add(12);
        Integer Max=Integer.MIN_VALUE;
        //System.out.println(Max);
        for(int i=0;i<list.size();i++){
            if(list.get(i) >Max){
                Max=list.get(i);
            }

        }

        //System.out.println(Max);

        
     Collections.sort(list);
        System.out.println(list);
    }
}
