/************************************************************************************
 * Java Programming - From Problem Analysis to Program Design 5th Edition
 * Chapter 2 - Exercise 4
 * markdhoad@gmail.com
 * 
 * 1.   Write a Java statement that imports the class Scanner.
 * 2.   Write a Java statement that declares console to be a Scanner object for
 *      inputting data from the standard input device.
 * 3.   Write Java statements that declare and initialize the following named 
 *      constants: SECRET of type int initialized to 11; RATE of type double 
 *      initialized to 12.50.
 * 4.   Write Java statements that declare the following variables: 
 *      num1, num2, and newNum of type int; name of type String; 
 *      hoursWorked and wages of type double.
 * 5.   Write Java statements that prompt the user to input two integers and 
 *      store the first number into num1 and the second number into num2.
 * 6.   Write a Java statement(s) that outputs the value of num1 and num2, indicating 
 *      which is num1 and which is num2. For example, if num1 is 8 and num2 is 5, 
 *      then the output is:
 *      The value of num1 = 8 and the value of num2 = 5.
 * 7.   Write a Java statement that multiplies that value of num1 by 2, 
 *      adds the value of num2 to it, and then stores the result in newNum. 
 *      Then write a Java statement that outputs the value of newNum.
 * 8.   Write a Java statement that updates the value of newNum by adding the 
 *      value of the named constant SECRET. Then, write a Java statement that 
 *      outputs the value of newNum with an appropriate message.
 * 9.   Write Java statements that prompt the user to enter a person’s last 
 *      name and then store the last name into the variable name.
 * 10.  Write Java statements that prompt the user to enter a decimal number 
 *      between 0 and 70 and then store the number entered into hoursWorked.
 * 11.  Write a Java statement that multiplies that value of the named constant 
 *      RATE with the value of hoursWorked and stores the result into the 
 *      variable wages.
 * 12.  Write Java statements that produce the following output:
 *
 *      Name: //output the value of the variable name
 *      Pay Rate: $ //output the value of the named constant RATE 
 *      Hours Worked: //output the value of the variable hoursWorked 
 *      Salary: $ //output the value of the variable wages
 *
 *      For example, if the value of name is "Rainbow" and hoursWorked is 45.50, 
 *      then the output is:
 *
 *      Name: Rainbow
 *      Pay Rate: $12.50
 *      Hours Worked: 45.50
 *      Salary: $568.75  
************************************************************************************/

import java.util.*;

public class exercise4 {

  static Scanner console = new Scanner(System.in);
  static final int SECRET = 11;
  static final double RATE = 12.50;

   public static void main(String[] args){
       int num1, num2, newNum;
       String name;
       double hoursWorked, wages;

       System.out.println("Please enter 2 integers and press enter");
       num1 = console.nextInt();
       num2 = console.nextInt();

       System.out.println("The value of num1 = " + num1 + " and the value of num2 = " + num2 + ".");

       newNum = num1 * 2 + num2;
       System.out.println("newNum = " + newNum);

       newNum += SECRET;
       System.out.println("newNum is now = " + newNum);

       System.out.println("Please enter your surname and press enter");
       console.nextLine(); //For capturing the newline character
       name = console.nextLine();

       System.out.println("Please enter a number between 0 and 70 and press enter");
       hoursWorked = console.nextDouble();

       wages = hoursWorked * RATE;

       System.out.println("Name: " + name);
       System.out.println("Rate: $" + RATE);
       System.out.println("Hours Worked: " + hoursWorked);
       System.out.println("Salary: $" + wages);
   } 
}