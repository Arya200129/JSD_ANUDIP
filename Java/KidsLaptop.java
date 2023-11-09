import java.util.Scanner;
class KidsLaptop{
	public static void main(String args[]){
		KidsLaptop obj = new KidsLaptop(); //class object
		obj.calculate(); //invoke method
	}

	public void calculate(){
		KidsLaptop obj = new KidsLaptop(); //class object

		Scanner sc = new Scanner(System.in); //scanner object

		int option;

		do {
		obj.displayOptions();
		System.out.println("Enter option"); 
		option= sc.nextInt();
		switch(option) { 
			case 1: 
				System.out.println("Enter two numbers to be added:"); 
				int num1=sc.nextInt();
				int num2=sc.nextInt();
				int resultadd=num1+num2;
				System.out.println("Addition of "+num1+" and "+num2+" is "+resultadd); 
				break;

			case 2: 
				System.out.println("Enter two numbers to be subtracted:"); 
				int num3=sc.nextInt();
				int num4=sc.nextInt();
				int resultsub=num3-num4;
				System.out.println("Subtraction of "+num3+" and "+num4+" is "+resultsub); 
				break;

			case 3: 
				System.out.println("Enter two numbers to be multiplied:"); 
				int num5=sc.nextInt();
				int num6=sc.nextInt();
				int resultmul = num5*num6;
				System.out.println("Multiplication of "+num5+" and "+num6+" is "+resultmul); 
				break;

			case 4: 
				System.out.println("Enter number to know the even-odd:"); 
				int num7=sc.nextInt();
				if(num7%2==0){
					System.out.println(num7+" is even");
				}else{
			 		System.out.println(num7+" is odd");
				}
				break;

			case 5: 
				System.out.println("Quiting");
				break; 

			default:
				System.out.println("Invalid choice. Please choose a valid option (1-5).");
		}
	   }while (option != 5);

	}

	public void displayOptions() {
		System.out.println("Options:");
		System.out.println("1. Addition of two numbers");
		System.out.println("2. Subtraction of two numbers");
		System.out.println("3. Multiplication two numbers");
		System.out.println("4. Check if a number is even or odd");
		System.out.println("5. Exit the program");
	}
}