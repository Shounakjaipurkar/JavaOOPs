package Cconstructor;

class human{
    static  int age;
    static String name;


public human(){
    age=23;
    name="shounak";
}
    public int s_age(){
    return age;
}
    public String s_name(){
        return name;
    }
    public void prt(){
        System.out.println("age of student"+age+"name of student"+name);
    }
   
    }

public class Main1{
    public static void main(String[] args) {
          human obj1=new human();
          System.out.println(obj1.s_age()+" and name is "+obj1.s_name());
          
    }
  
    
}






// class Human {
//     int age;
//     String name;

//     public Human() {
//         age = 23;
//         name = "shounak";
//     }

//     public int getAge() {
//         return age;
//     }

//     public String getName() {
//         return name;
//     }

//     public void prt() {
//         System.out.println("age of student " + age + " name of student " + name);
//     }
// }

// public class Main1 {
//     public static void main(String[] args) {
//         Human obj1 = new Human();
//         System.out.println(obj1.getAge() + " and name is " + obj1.getName());
//         obj1.prt();
//     }
// }

