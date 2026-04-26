package Zdemo;

class exp{
	public void test() {
		int a[]= {1,2,3,4,5};
		int i=0;
		try {
		for(i=0;i<=8;i++) {
			System.out.println(a[i]);		}
		}
		
		catch(IndexOutOfBoundsException e){
			System.out.println("something is wrong");
			System.out.println(e);
			
		}
		finally{
			System.out.println("hey there i always runnnnnnnn!!!");
		}
		
		System.out.println("lets continue");
	}
}

public class Main2 {
	public static void main (String[]args) {
		exp obj=new exp();
		obj.test();
		
	}
}
