package Basics;

public class SimplePattern {
    public static void main(String args[]){
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.print("* *\n");
        System.out.println("*");


        //
        for(int i=4 ;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
