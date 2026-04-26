package FPolymorphisam;
//runtime polymorphisam exmaple
class Animal{
	 void sound() {
		System.out.println("Animal makes sound");
	}
}
class Cat extends Animal{
	 void sound() {
		System.out.println("Cat mewow");
	}
}
class Dog extends Animal{
	 void sound() {
		System.out.println("dog barks");
	}
}

public class Main2 {
	static void makesound(Animal a) {
		a.sound();
	}
public static void main(String[]args) {
	Animal obj1=new Cat();
	Animal obj2=new Dog();
	
	obj1.sound();
	obj2.sound();
    makesound(new Cat());	
    makesound(new Dog());
    
}
}
