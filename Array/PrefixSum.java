import java.sql.SQLOutput;

public class PrefixSum {
    public static int Prefix(int arr[]) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;

        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }

        for(int i=0;i<prefix.length;i++){
            System.out.print(prefix[i]+" ");
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum= i==0?prefix[j]:prefix[j]-prefix[i-1];
                System.out.println(currSum);
                if(currSum > max)
                    max=currSum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 8, 9, -7, 5};

        System.out.println(Prefix(arr));
    }
}
