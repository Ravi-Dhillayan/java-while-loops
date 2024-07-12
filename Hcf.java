package dloop;
import java.util.Scanner;

public class Hcf {
	public static void main (String[]args)
	  {
	    int num1 , num2, hcf;
	    System.out.print("Enter any number ");
	    Scanner o = new Scanner(System.in);
        num1 = o.nextInt(); //2
        num2 = o.nextInt();//4

	    while (num1 != num2)
	    {
	        if (num1 > num2)
	            num1 -= num2;
	        else
	            num2 = num2-num1;
	    }


	    System.out.println("The HCF: "+ num1);
	   // System.out.println("hcf"+num2);
	  }
}
