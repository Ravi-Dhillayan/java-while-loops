package dloop;

import java.util.Scanner;

public class dosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,no=0,c;
		char op;
		
		Scanner o=new Scanner(System.in);
		do
		{
			System.out.println("Enter the two no. ");
			a=o.nextInt();
			b=o.nextInt();
			c=a+b;
			System.out.println("sum of No. "+c);

			System.out.println("Do you want to try again..y/n");
			 op =o.next().charAt(0);
			 
		}while(op=='y' || op=='Y');
		
	}

}
