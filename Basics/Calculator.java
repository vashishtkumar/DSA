package Basics;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char ch=sc.next().charAt(0);
        switch (ch){
            case '+':
                System.out.println("the addition of number is : "+ a+b);
                break;
            case '-':
                System.out.println("the subtraction of number is : "+(a-b));
                break;
            case '*':
                System.out.println("the multiplication of number is : "+ a*b);
                break;
            case '/':
                System.out.println("the divison of number is : "+ a/b);
                break;
            case '%':
                System.out.println("the addition of number is :"+a%b);
                break;
            default:
                System.out.println("invalid operation");
        }
        System.out.println();
    }
}
