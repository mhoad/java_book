/*****************************************************************************
 * Java Programming - From Problem Analysis to Program Design 5th Edition
 * Chapter 2 - Exercise 3
 * markdhoad@gmail.com
 * 
 * Repeat Exercise 2 by declaring num1, num2, and num3, and average of type
 * double. Store 75.35 into num1, -35.56 into num2, and 15.76 into num3.
 *****************************************************************************/

public class exercise3 {
   public static void main(String[] args){
       double num1, num2, num3, average;
       num1 = 75.35;
       num2 = -35.56;
       num3 = 15.76;
       average = (num1 + num2 + num3) / 3;

       System.out.println("Num 1 = " + num1);
       System.out.println("Num 2 = " + num2);
       System.out.println("Num 3 = " + num3);
       System.out.println("Average = " + average);
   } 
}