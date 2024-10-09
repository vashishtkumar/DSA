public class MaxSumOfSubArrayUsingKadansAlgorithm {

    public static int kadans(int arr[]){
        int currentSum=0;
        int Max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            currentSum= currentSum+arr[i] > 0? currentSum+arr[i]:0;
            if(currentSum>Max){
                Max=currentSum;
            }
        }
        return  Max;

    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};

        System.out.println(kadans((arr)));

    }
}
