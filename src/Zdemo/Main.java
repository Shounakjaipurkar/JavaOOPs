package Zdemo;
class show{
	
public void meth(int a, int b) {
	System.out.println("hey there the value of a and b is :" +a+" "+b);
}
public void meth(int a, int b,int c) {
	System.out.println("hey there the value of a and b is :" +a+" "+b);
	System.out.println("addtional value of c is :"+c);
}
}

public class Main extends show{
public static void main(String[]args) {
	show obj=new show();
	obj.meth(1, 2);
	obj.meth(1, 2,3);
	
	
}
}



