package dloop;
import java.util.*;

public class revse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,re=0,rem;
		char t;
		Scanner ob=new Scanner(System.in);
		
     do {
    	 System.out.println(" Enter the no..");
    	 n=ob.nextInt();
    	while(n!=0) { rem=n%10;
    	 re=re*10+rem;
    	 n=n/10;
    	}
    	 System.out.println(re);
    	 System.out.println("Do you want to try again..y/n");
		 t =ob.next().charAt(0);
	}while(t=='y' || t=='Y');
	}

}
