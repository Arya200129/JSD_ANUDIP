package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEg1 {

	public static void main(String[] args) {
		//creation of object for class StudentDetails
		StudentDetails s1 = new StudentDetails(11, "ram", 987654321, true);
		StudentDetails s2 = new StudentDetails(12, "bharti", 887654321, true);
		StudentDetails s3 = new StudentDetails(13, "vishal", 887554321, false);
		StudentDetails s4 = new StudentDetails(14, "kabir", 787654321, true);
		StudentDetails s5 = new StudentDetails(15, "john", 777654321, false);
		StudentDetails s6 = new StudentDetails(16, "komal", 767654321, true);
		StudentDetails s7 = new StudentDetails(17, "priya", 667654321, false);
		StudentDetails s8 = new StudentDetails(18, "sam", 687654321, true);
		
		//creating arraylist
		ArrayList<StudentDetails> aa2 = new ArrayList<StudentDetails>();
		aa2.add(s8);
		aa2.add(s4);
		aa2.add(s5);
		aa2.add(s1);
		aa2.add(s2);
		aa2.add(s3);
		aa2.add(s7);
		aa2.add(s6);
		
		aa2.remove(1);
		
		//traversing using iterator
		Iterator<StudentDetails> i =aa2.iterator();
		while(i.hasNext()) {
			StudentDetails ss = i.next();
			System.out.println(ss.sid + " " + ss.sname + " " + ss.sphone + " " + ss.graduate);
		}
		
		System.out.println("------------------------");
		Collections.sort(aa2);
		for(StudentDetails ss : aa2) {
			System.out.println(ss.sid + " " + ss.sname + " " + ss.sphone + " " + ss.graduate);
		}
	}

}
