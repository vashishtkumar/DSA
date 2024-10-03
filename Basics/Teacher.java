package Basics;

import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        float f=sc.nextFloat();

        System.out.println(a + "," +s);
        System.out.printf("%.5f\n",f);
        System.out.format("%.2f",f);
        System.out.format("%.3f"+"%.4f",a,a);
    }



}
