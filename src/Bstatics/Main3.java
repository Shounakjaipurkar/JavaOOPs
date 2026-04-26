package Bstatics;

public class Main3 {
    String name;
    int age;
     public static void main(String[] args) {
           Main3 obj1=new Main3();
          System.out.println(obj1.name); 
          System.out.println(obj1.age);
                //when i call it op will be null and 0 
                //bcz of this every time i have to set the value
                //eg
         obj1.age=21;
         obj1.name="shounak";
         System.out.println(obj1.name); 
         System.out.println(obj1.age);
               //what if there is something when we create an object it will assign the value 
               //that when we need constructor
     }
}
