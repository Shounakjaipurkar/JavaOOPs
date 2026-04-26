package Finheritacnce;

class ani{
    public void sound(){
        System.out.println("Animal makes sound");
    }
}
class dogi extends ani{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
}
public class Main3 {
    public static void main(String[] args) {
        ani obj1=new dogi();
        obj1.sound();
    }
    
}

