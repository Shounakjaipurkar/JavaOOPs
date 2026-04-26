//package FPolymorphisam;
//
////compile time polymorphisam
//class show{
//	
//public void meth(int a, int b) {
//	System.out.println("hey there the value of a and b is :" +a+" "+b);
//}
//public void meth(int a, int b,int c) {
//	System.out.println("hey there the value of a and b is :" +a+" "+b);
//	System.out.println("addtional value of c is :"+c);
//}
//}
//
//public class Main1 extends show{
//public static void main(String[]args) {
//	show obj=new show();
//	obj.meth(1, 2);
//	obj.meth(1, 2,3);
//	
//	
//}
//}
package FPolymorphisam;
//runtime polymorphisam
class gett {
    public void meth(int a, int b) {
        System.out.println("the value of user input is : " + a + " " + b);
    }
}

class show extends gett {
    public void meth(int a, int b) {
        System.out.println("the value received from database child : " + a + " " + b);
    }
}

public class Main1 {
    public static void main(String[]args) {

        gett obj1 = new show();  
        obj1.meth(10, 20);

    }
}