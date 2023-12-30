



//Assignment-1 - lab_30-11-23_anp-c6597

import java.util.Scanner; 

//main class
class Car{
	
	String make; 
	String model;
	short year;
	int price;
	
	//constructor takes parameters for the attributes
	public Car(String mk, String mdl, short yr, int p){
		make = mk;
		model = mdl;
		year = yr;
		price = p;
	}
	
	//display method to display the car attributes
	void display(){
		System.out.println("This car is " + model + " " + make + ", year:" + year + ", price: Rs." + price);
	}
	
	//main method
	public static void main(String args[]){
		
		//scanner object to take input of car attributes from user
		Scanner sc = new Scanner(System.in);  
		
		System.out.println("Enter the car make:");
		String mk = sc.nextLine();  //taking input in string
		
		System.out.println("Enter the car model:");
		String mdl = sc.nextLine();  //taking input in string
		
		System.out.println("Enter the car year:");
		short yr = sc.nextShort();  //taking input in short
		
		System.out.println("Enter the car price:");
		int p = sc.nextInt();  //taking input in int
		
		Car car_obj = new Car(mk, mdl, yr, p);  //object creration
		car_obj.display();  //invoke with object
	}
}