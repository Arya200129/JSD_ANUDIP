//lab_30-11-23_anp-c6597
//Assignment-1 - Constructor

import java.util.Scanner; 

//main class
class Car{
	String make;  //instance variables-attributes 
	String model;
	short year;
	int price;
		
	
	//constructor takes parameters for the attributes
	public Car(String make, String model, short year, int price){
		//Accessing the instance variable using 'this' keyword.
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	//display method to print the car attributes
	void display(){
		System.out.println("This car is " + this.model + " " + this.make + ", year:" + this.year + ", price: Rs." + this.price);
	}
	
	//main method
	public static void main(String args[]){
		
		//scanner object to take input of car attributes from user
		Scanner sc = new Scanner(System.in);  
		
		System.out.println("Enter the car make:");
		String make = sc.nextLine();
		
		System.out.println("Enter the car model:");
		String model = sc.nextLine();
		
		System.out.println("Enter the car year:");
		short year = sc.nextShort();
		
		System.out.println("Enter the car price:");
		int price = sc.nextInt();
		
		//Creating an instance of the class
		Car obj = new Car(make, model, year, price);
		//Calling the method of the class
		obj.display();
	}
}