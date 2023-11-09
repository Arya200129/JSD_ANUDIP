import java.util.Scanner; //import Scanner package
class CircleArea{
	
	void area_calc(double rad){	
		double area1 = 3.14 * (rad*rad);
		System.out.println("Area of circle is "+area1); 
	}

	public static void main(String args[]){	
		Scanner sc = new Scanner(System.in);
		CircleArea obj = new CircleArea();

		System.out.print("Enter radius of circle:"); 
		double radius= sc.nextDouble();

		obj.area_calc(radius);
	}
}