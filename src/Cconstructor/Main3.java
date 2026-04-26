package Cconstructor;

// class home{
//     String name;

// public home(String name){
//     this.name=name; // first use case of this is : to avoid the confusion between the instance variable and the parameter.
// }

// public void show(){
// System.err.println("The name of the person is :"+ this.p_name);
// }

// public void prt(){
//     this.show();
// }
// }


// public class Prog14 {
//     public static void main(String[] args) {
//         home obj1=new home("Shounak1");
//         home obj2=new home("Shounak2");
//         home obj3=new home("Shounak3");

//         obj3.prt();
        
//     }
    
// }
class Main3
{
Main3(){
    this(20);
    System.out.println("Defalut constructor");
}
Main3(int age){
    System.out.println("The age is "+age);
}
public static void main(String[] args) {
    
    Main3 obj1=new Main3();
}
}
