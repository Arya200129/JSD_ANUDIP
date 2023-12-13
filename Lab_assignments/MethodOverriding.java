//lab_anp-c6597_05-12-23
//OOPS Concept -- Assignment-2

//parent class
class Animal{
	void makeSound(){
		System.out.println("The animal makes a sound.");
	}
}

//child class
class Dog extends Animal{
	void makeSound(){
		System.out.println("The Dog barks.");
	}
}

//child class
class Cat extends Animal{
	void makeSound(){
		System.out.println("The Cat meows.");
	}
}

//main class
class MethodOverriding{
	//main method
	public static void main(String[] args){
		Dog d = new Dog(); //object creation
		d.makeSound(); //invoke method
		
		Cat c = new Cat(); //object creation
		c.makeSound(); //invoke method
		
	}
}