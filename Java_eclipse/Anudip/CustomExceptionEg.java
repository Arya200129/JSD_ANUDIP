package Anudip;

public class CustomExceptionEg {
	
	static public void check(int age, int passout) throws InvalidStudentException{
		if((age<18 || age>25) || (passout<2022 || passout>2025)){
			throw new InvalidStudentException("Category not match for enrollment");
		}
		else {
			System.out.println("you are eligible to to enroll in course");
		}
	}

	public static void main(String[] args) throws InvalidStudentException{
		check(25,2020);

	}

}
