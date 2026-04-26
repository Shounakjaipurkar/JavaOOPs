package Finheritacnce;
//multilevel inheritance
class animal{
    public void sound(){
        System.out.println("Animal makes sound");

    }

}
class cat extends animal{
    public void sound(){
        System.out.println("Cat meows!! ");
    }

}
class dog extends cat{
    public void sound(){
        System.out.println("dog barkssss!! ");
    }
}

public class Main2 {
public static void main(String[] args) {
    animal a1=new cat();
    animal a2=new dog();
    a1.sound();
    a2.sound();
}    
    
}
