//lab_30-11-23_anp-c6597
//Assignment-2 - Method overloading

//main class
class Calculator{
	
	//same name, same datatype but different no. of parameters
	public int add(int num1, int num2){
		int sum = num1 + num2;
		return sum;
		
	}
	
	//same name, same datatype but different no. of parameters
	public int add(int num1, int num2, int num3){
		int sum = num1 + num2 + num3;
		return sum;
		
	}
	
	//same name, same no. of parameters but different datatype
	public double add(double num1, double num2){
		double sum = num1 + num2;
		return sum;
		
	}
	
	//main method
	public static void main(String args[]){
		Calculator calc = new Calculator(); //object creration
		System.out.println(calc.add(56, 62)); //invoke with object 
		System.out.println(calc.add(81, 52, 10));
		System.out.println(calc.add(856.2, 41.5));
	}
}
