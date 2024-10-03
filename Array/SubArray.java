public class SubArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};

        for(int i=0;i<arr.length;i++){
            int trav=arr.length-i;
            int loop=i;
            while(trav > 0) {
                for (int j=i;j <=loop;j++ ) {
                    System.out.print(arr[j] + " ");
                }
                loop++;
                trav--;
                System.out.println();
            }
        }



    }
}
