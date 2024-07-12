package dloop;


	import java.util.Scanner;


	class ye{
		void ey() {
		 int y;
	     Scanner o=new Scanner(System.in);
	     System.out.println("Enter the Year..");
	     y=o.nextInt();
	     if(y%4==0 && y%400!=0||y%100==0)
	 	{
	 		System.out.println(y+" year is a leap Year");
	 	}
	 	else {
	 		System.out.println(y+" not year is a leap Year");
	 	}
	}
	}
class fst extends ye{
	void ey() {
		System.out.println(" Java is a Prgramming ");
	}
	
}
	public class fr {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	    fst ob=new fst();
       // ob.ffst();
	    ob.ey();
	  }

	}


