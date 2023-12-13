package Anudip;

public class Employee {

	public long employeeId;
	public String employeeName;
	public String employeeAddress;
	public long employeePhone;
	public double basicSalary;
	public double specialAllowance;
	public double hra;
	
	Employee(){
		this.specialAllowance = 250.80;
		this.hra = 1000.50;
	}
	
	Employee(long id, String name, String address, long phone){
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	
	void calculateSalary() {
		double salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100); 
		System.out.println("Salary: " + salary);
		
	}
	
	void calculateTransportAllowance() {
		double transportAllowance = 10*basicSalary/100;
		System.out.println("Transport Allowance: " + transportAllowance);
	}
	
}
class Manager extends Employee{
		
	Manager(long id, String name, String address, long phone, double salary){
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
		this.basicSalary = salary;
	}
	
	void calculateTransportAllowance() {
		double transportAllowance = 15*basicSalary/100;
		System.out.println("Transport Allowance: " + transportAllowance);
	}
}
	
class Trainee extends Employee{
		
	Trainee(long id, String name, String address, long phone, double salary){
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
		this.basicSalary = salary;
	}
}

