package Map;
import java.util.*;

public class MajorityElement {
    public static void majorityElement(int arr[]){
HashMap<Integer,Integer> hm=new HashMap<>();
   for(int i=0;i<arr.length;i++){
    if (hm.containsKey(arr[i])) {
        int value = hm.get(arr[i]);  
        value++;                     
        hm.put(arr[i], value);       
    } else {
        hm.put(arr[i], 1);         
    }
   }

   for(Integer i:hm.keySet()){
    if(hm.get(i) >= arr.length/3){
System.out.println(arr[i]);
    }
   }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        majorityElement(arr);
    }

    
}
