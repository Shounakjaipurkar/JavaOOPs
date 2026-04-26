package Ginnerclass;

public class Main1 {
    class inner {
        public void show(){
            System.out.println("hey i am inner class");
        }
    }
        public static void main(String[] args) {
            Main1 outerO=new Main1();
            inner innerO= outerO.new inner();
            innerO.show();
        }
    }



// public class Main1 {
//     // This is the Inner Class
//     class Inner { 
//         public void show() {
//             System.out.println("hey i am inner class");
//         }
//     }

//     public static void main(String[] args) {
//         // 1. Create the Outer class instance
//         Prog21 outerO = new Prog21();
        
//         // 2. Create the Inner class instance using the Outer instance
//         Prog21.Inner innerO = outerO.new Inner();
        
//         innerO.show();
//     }
// }
