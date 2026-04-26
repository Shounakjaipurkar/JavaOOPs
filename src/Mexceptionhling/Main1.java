package Mexceptionhling;
//nested try 
class exception{
	int a[]= {1,2,3,4,5,0};
	int r;
	public void meth() {
		try {
		r=(a[1]/a[5]);
		System.out.println(r);
		 try {
			 System.out.println(a[10]);
		 }
		 catch(ArithmeticException e) {
			 System.out.println(e);
		 }
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
		finally {
			System.out.println("this line will always runn :) :(");
		}
		
		System.out.println("hey we will continuew this ");
;		
	}
	
}
public class Main1 {
	public static void main(String[]args) {
		exception obj1=new exception();
		obj1.meth();
	}

}



