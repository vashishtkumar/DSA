package Basics;

import java.util.Scanner;


public class PrimeOrNOt {
    static boolean Prime(int n){
        if(n==1)
            return false;
        for(int i=2; i <= Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(Prime(a));
    }
}
