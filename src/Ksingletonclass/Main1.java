package Ksingletonclass;

public class Main1 {
public static void main(String[]args) {
	Abc m1=Abc.getInstance();
	Abc m2=Abc.getInstance();
}
	
}
class Abc{
	private static Abc obj=new Abc();
	
	private Abc(){
		System.out.println("hello singleton");
		}
	
	public static Abc getInstance() {
		return obj;
	}
}
