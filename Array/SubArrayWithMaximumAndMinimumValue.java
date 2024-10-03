import java.util.Scanner;

public class SubArrayWithMaximumAndMinimumValue {
    public static int[] subArray(int arr[]){
        int arr1[]=new int[2];
        arr1[0]=Integer.MIN_VALUE;
        arr1[1]=Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++ ){
            for(int j=i ;j < arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
               if(sum > arr1[0]){
                arr1[0]=sum;}
                if(sum <arr1[1]){
                arr1[1]=sum;}
                System.out.println();
            }
            System.out.println();
        }
            return arr1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int arr1[];
        arr1=subArray(arr);
        System.out.println("the max value of subArray is :"+arr1[0]+ " the min value of subArray :"+arr1[1]);


    }
}
