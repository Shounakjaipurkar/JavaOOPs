package Zdemo;

public class Main1 {
public static void main(String[]args) {
	Xyz m1=Xyz.getInstance();
	Xyz.getInstance();
}
}

class Xyz{
	private static Xyz obj=new Xyz();
	
	private Xyz(){
		System.out.println("you are in priavate constructor");
	}
	
	public static Xyz getInstance() {
		return obj;
	}
}

