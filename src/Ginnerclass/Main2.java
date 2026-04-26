package Ginnerclass;

//This is method local inner class

class Outer {
  public void outerMethod(){
      System.out.println("this is outer method");
  
      class Inner{
          public void innerShow(){
              System.out.println("this is inner method");
          }
      }
      Inner obj = new Inner();
      obj.innerShow();
  }
}

public class Main2{
  public static void main(String[] args) {
      Outer obj2 = new Outer();
      obj2.outerMethod();
  }
}


//public void localmeth() { // 1. Enter Workshop
  
//   class Inner {         // 2. Write the Manual
//       void show() { 
//           /* action */ 
//       }
//   }                     // 3. Manual is finished

//   Inner obj = new Inner(); // 4. Build the tool    
//   obj.show();              // 5. Use the tool
//}

//note the object must be defined outside the class or it will create an
//chiken egg problem ??


//what is chicken egg problem :
//The Problem in your code
//The Egg: You need an Object to run the show() method.

//The Chicken: You put the code to create the Object inside the show() method.

//The Result: * To create the object, you have to run the method.

//But to run the method, you first need the object!

//Nothing happens (or the program crashes).

//The Two Ways this problem happens:
//1. The "Never Starting" Problem
//If the only place you write new Inner() is inside the show() method, the computer sits there waiting. Since nobody outside calls the method, the object is never created. It's like a car that can only be started by a button located under the engine while it's already running.

//2. The "Infinite Loop" Problem (Recursion)
//If you do manage to start it, you get this:

//show() starts.

//show() creates a new object.

//That new object calls show().

//That show() creates another new object...

//How to solve it
//You solve it by moving the object creation outside the class definition.