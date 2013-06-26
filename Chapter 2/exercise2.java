/*****************************************************************************
 * Java Programming - From Problem Analysis to Program Design 5th Edition
 * Chapter 2 - Exercise 2
 * markdhoad@gmail.com
 * 
 * 1. Write Java statements that declare the following variables: 
 *    num1, num2, and num3, and average of type int.
 * 2. Write Java statements that store 125 into num1, 28 into num2, 
 *    and -25 into num3.
 * 3. Write a Java statement that stores the average of num1, num2, 
 *    and num3 into average.
 * 4. Write Java statements that output the values of num1, num2, 
 *    num3, and average.
 * 5. Compile and run your program.
 *****************************************************************************/

public class exercise2 {
   public static void main(String[] args){
       int num1, num2, num3, average;
       num1 = 125;
       num2 = 28;
       num3 = -25;
       average = (num1 + num2 + num3) / 3;

       System.out.println("Num 1 = " + num1);
       System.out.println("Num 2 = " + num2);
       System.out.println("Num 3 = " + num3);
       System.out.println("Average = " + average);
   } 
}