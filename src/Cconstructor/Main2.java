package Cconstructor;
//types of constructor
//default and parameterised constructor in java

class student{
  int s_no;
  String s_name;
  int s_age;

public student(){    //defalut constructor
  s_no=2310;
  s_name="shounak";
  s_age=20;
} 
public student(int no,String name,int age){ //parameterised constructor
  s_no=no;
  s_name=name;
  s_age=age;
  
}
public void prt(){
  System.out.println("Student no : "+s_no+"\nname :"+s_name+"\nage : "+s_age);
  System.err.println("-----------------------------------------------");
}

}


public class Main2 {
  public static void main(String[] args) {
      student s1=new student();
      student s2=new student();
      student s3=new student(234,"jay",34);
      s1.prt();
      s2.prt();
      s3.prt();
      
     
  }
  
}
