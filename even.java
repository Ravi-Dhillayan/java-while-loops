 //Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

package dloop;

import java.util.Scanner;

public class even {
	public static void main(String[] args) {

	 Scanner console = new Scanner(System.in);
	 
     int number;
     char choice;
     int even = 0;
     int odd = 0;

     do
     {
         System.out.print("Enter any number ");
         number = console.nextInt();

         if( number % 2 == 0)
         {
          even  =  even +number;
         }
         else
         {
             odd += number;
         }

         System.out.print("Do you want to continue y/n? ");
         choice = console.next().charAt(0);

     }while(choice=='y' || choice == 'Y');

     System.out.println("Sum of even numbers: " + even);
     System.out.println("Sum of odd numbers: " + odd);
    }

    
   
	


}
