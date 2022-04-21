package ch13;


class People {
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

class Student extends People {
	public int studentNo;
	
	
	public Student (String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동","123456-1234567",10112);
		
		System.out.println("name : " + student.name);
	}

}
