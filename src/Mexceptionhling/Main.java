package Mexceptionhling;
//exception handling
class expt{
	int a[]= {10,9,8,0,1};
	int r;
	
	public void show() {
		try {
		r=a[0]/a[3];
		System.out.println(r);
		System.out.println(a[10]);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("hey you i will always runnnnn!!!");
		}
		System.out.println("hey there welcome ::");
	}
}

public class Main {
	
public static void main(String[]args) {
	expt obj1=new expt();
	obj1.show();

		
	}

}
