package dloop;

import java.util.*;

public class zno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        char op;
        Scanner o=new Scanner(System.in);
        do
        {
        	System.out.println("Enter the N no. ");
			n=o.nextInt();
			if(n<0) {
				System.out.println("This is negative  ...");
			}else if(n>0){
				System.out.println("This is positive  Number ...");
			}else if(n==0) {
				System.out.println("This is a  zero Number ...");
			}else {
				System.out.println("This is Sapical Character ...");
				
			}	 
			System.out.println("Do you want to try again..y/n");
			 op =o.next().charAt(0);
			}while(op=='y' || op=='Y');

		
        
	
	}

}
