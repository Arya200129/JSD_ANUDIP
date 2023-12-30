package collections;

//user defined class
public class StudentDetails implements Comparable<StudentDetails>{
	//instance variables
	int sid;
	String sname;
	long sphone;
	boolean graduate;
	
	//parameterized constructor
	public StudentDetails(int sid, String sname, long sphone, boolean graduate) {
		this.sid = sid;
		this.sname = sname;
		this.sphone = sphone;
		this.graduate = graduate;
	}

	@Override
	public int compareTo(StudentDetails s) {
		return sname.compareTo(s.sname);
	}
}
