package Finheritacnce;
//super keyword 
class Vehi {
    int max=120;
}
class Car extends Vehi {
    public void speed(){
        int max=180;
        System.out.println("The max speed local :"+max);
        System.out.println("The max speed :"+super.max);
    }
}


public class Main4 {
    public static void main(String[]args){
    Car obj1=new Car();
    obj1.speed();
    
    }
}

