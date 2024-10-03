package Basics;

public class TypeConversion {
    public static void main(String[] args){
   byte a=8;
   short b=90;
   int c=89;
   long d=78; 
   float f=d;  // doubt; // implicit
   System.out.println(f);

   int temp=(int) f;
   System.out.println(temp);
    }
}
