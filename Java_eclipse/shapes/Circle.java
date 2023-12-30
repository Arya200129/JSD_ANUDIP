package shapes;

public class Circle {
	
	private float radius;
	float pi;
	
	public Circle(){
		radius = 1.5f;
		pi =3.5f;
	}
	
	Circle(float radius){
		this(radius,3.5f);
	}
	
	public Circle(float radius, float pi){
		this.pi = pi;
		this.radius = radius;
	}
	
	float calculateCircleArea(float radius){
		float area = this.pi*radius*radius;
		return area;
	}
	
	float calculateCircumference(float radius){
		float circumference  = 2*this.pi*radius;
		return circumference;
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println("Area of circle: " + c.calculateCircleArea(2.1f));
		System.out.println("Circumference of circle: " + c.calculateCircumference(2.1f));
	}
}
