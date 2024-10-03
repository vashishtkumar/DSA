
import java.util.Scanner;

public class BinarySearch {
     public static int binarySearch(int arr[],int target){
        int start=0,end=arr.length-1;
        while(start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        System.out.println(binarySearch(arr,target));


  sc.close();
    }
}
