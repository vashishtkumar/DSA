package Basics;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;
        for (; number > 0; ) {
            int rem = number % 10;
            number /= 10;
            reverse = reverse * 10 + rem;
        }
        System.out.println(reverse);
    }
}
