package Basics;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();

        if(year % 400 == 0 )
            System.out.println("it is leap year : "+year);
            else if(year % 4 == 0 && year %100!=0)
                System.out.println("it is leap year :" +year);
            else
            System.out.println("it is not leap year :"+year);
        }
    }

