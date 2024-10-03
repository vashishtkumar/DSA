public class ArrangeNegativeAndPositive {
    public static void main(String[] args) {
        int []arr=new int[]{1,-9,7,5,-78,89,-4};

        int posIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0 && posIndex==-1){
                posIndex=i;
            }

            if(arr[i]<0 && posIndex!=- 1){
                int temp=arr[i];
                arr[i]=arr[posIndex];
                arr[posIndex]=temp;
                posIndex++;
            }
        }

        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
}
