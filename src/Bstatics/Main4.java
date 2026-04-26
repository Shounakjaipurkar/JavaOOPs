package Bstatics;
//static block
//Static block scope

class univercity{

 static int u_no;
  String name;
  int rating;

public univercity(){
 
  name="SJK";
  rating=9;   
}
static {
  u_no=234;    //u_no mst be static otherwise it will give an error!!!!
  System.out.println("this is static block");
}
public void prt(){
  System.out.println("univercity no: "+u_no+"\nname is "+name+"\nrating: "+rating);
}
}

public class Main4 {
  public static void main(String[] args) {
      univercity obj1=new univercity();
      univercity obj2=new univercity();
      obj1.prt();
      obj2.prt();
      

  }
  
}
