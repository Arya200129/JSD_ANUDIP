// Assignment-2.

//main class
class Employee{
	
	// protected variables can be accessed within the package 
	// and outside the package through child class.
	
	protected int id; 
	protected int age = (int) 35.5;  // double value is typecasted into int age variable 
	protected String name;
	protected boolean isPermanent;
	
	//main method, the entry point of the program.
	public static void main(String args[]){
		System.out.print("Successfully started");  // Printing the message
	}
}