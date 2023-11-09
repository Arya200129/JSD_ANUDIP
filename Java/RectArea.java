import java.util.Scanner; //import Scanner package
class RectArea{
	
	void area_calc(int length, int breadth){	
		int area1 = length * breadth;
		System.out.println("Area of rectangle is "+area1); 
	}

	public static void main(String args[]){	
		Scanner sc = new Scanner(System.in);
		RectArea obj = new RectArea();

		System.out.print("Enter length of rectangle:"); 
		int length = sc.nextInt();

		System.out.print("Enter breadth of rectangle:"); 
		int breadth = sc.nextInt();

		obj.area_calc(length, breadth);
	}
}