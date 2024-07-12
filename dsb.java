package dloop;
import java.util.*;

public class dsb {
	public static void main(String[] args) {
	int a,b;
char op;
	Scanner o=new Scanner(System.in);
	
	do {
		System.out.println("Enter the two No...");
		a=o.nextInt();
		b=o.nextInt();
		if(a>b) {
			System.out.println("1st number is a largest...... ");
		}else if(b>a) {
			System.out.println("2nd number is a largest. number...... ");
		}
		else {
			System.out.println("Your rong Input");
		}
//		if(a<b) {
//			System.out.println("1st number is a smallest...... ");
//		}else if(b<a) {
//			System.out.println("2nd number is a smallest. number...... ");
//		}
//		else {
//			System.out.println("Your rong Input");
//		
//		}
		System.out.println("Do you want to try again..y/n");
		 op =o.next().charAt(0);
	}while(op=='y' || op=='Y');
	}}
