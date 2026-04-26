package Dencapsulation;

class stud {
    private String name;

public String getName(){
    return name;
}
public void setName(String newname){
    this.name=newname;
}
   
}  

public class Main1{
     public static void main(String []args){
        stud obj = new stud();
        obj.setName("shounak");
        System.out.println(obj.getName());
     }
} 

