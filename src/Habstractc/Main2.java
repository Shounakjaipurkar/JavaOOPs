package Habstractc;

abstract class Person{
    
    public void show(){
        System.out.println("hello there");
    }

}
class Display extends Person{
public void prt(){
System.out.println("this is the another displya method which is in another child class");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Display obj1=new Display();
        obj1.show();
    }
}
// this code will run perfectly :)