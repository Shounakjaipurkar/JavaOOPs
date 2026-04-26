package Bstatics;
//static method
class Bile{
    String brand;
    int price;
    static String name;  //very importent


public void show(){
    System.out.println(brand+":"+price+":"+name);
}
public static void show1(Bile obj){ //static method
    
    System.out.println(obj.brand+":"+obj.price+":"+name+" This is mobile.show1()");
 
}
}
public class Main2 {
    public static void main(String[]args){
        Bile obj1=new Bile();
        obj1.brand="Apple";
        obj1.price=1500;
        Bile.name="Smartphone";

        Bile obj2=new Bile();
        obj2.brand="Samsung";
        obj2.price=1500;
        Bile.name="Smartphone";

       
        
        Bile.name="phone";

    obj1.show();
    obj2.show();
    Bile.show1(obj1);


    }    
}
//Why does main method contain static keyword
// When running a Java program (e.g., java MainClass), 
// the JVM loads the class into memory and searches for the 
// specific public static void main(String[] args) 
// signature as the starting point. No objects exist yet at this stage, 
// so a non-static main would require object instantiation first, 
// creating a deadlock since constructors depend on the program already running

//in my language:
//so basically main method is the starting point of execution 
//if we dont write static in main method it needs object to access it
//that means we can no call main without the object of the class 
//but we know the main is starting point of execution if execution is not 
//started how can we access the object of the main method 
//it means this is deadlock

//to solve this problem we use the static keyword for the main method.
