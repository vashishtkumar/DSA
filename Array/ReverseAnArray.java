import java.util.Scanner;

public class ReverseAnArray {
    public static void Reverse(int arr[]){
        int size=arr.length-1;
        for(int i=0 ;i<size;){
            arr[i]=arr[i]+arr[size];
            arr[size]=arr[i]-arr[size];
            arr[i]=arr[i]-arr[size];
            i++;size--;
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,23,45,6,9};

        Reverse(arr);
        for(int i=0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
