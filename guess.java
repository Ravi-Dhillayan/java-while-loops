package dloop;
import java.util.*;

public class guess {
	public static void main(String[] args) {
	int n;
	
	char op;
	int no=(int) ((Math.random()*100)+1);
	Scanner o=new Scanner(System.in);
	
	do {
		System.out.println("Enter the guess no.");
		n=o.nextInt();
		
		if(n<no) {
			System.out.println("too  low");
		}	else if(n>no)
			{
				System.out.println("too high");
			}
		else			{
			System.out.println("guess your no ...");
			}
		System.out.println("Your rong input ...");
		//	System.out.println("Do you want to try again..y/n");
		//	 op =o.next().charAt(0);
		}	while(n!=no);
	

}

}
