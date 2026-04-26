
package Bstatics;
//static variable
class Mobile{
    String brand;
    int price;
    static String name;  //very importent


public void show(){
    System.out.println(brand+":"+price+":"+name);
}
}
public class Main {
    public static void main(String[]args){
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        Mobile.name="Smartphone";

        Mobile obj2=new Mobile();
        obj2.brand="Apple";
        obj2.price=1500;
        Mobile.name="Smartphone";

       
        
        Mobile.name="phone";

    obj1.show();
    obj2.show();
    
    


    }    
}
