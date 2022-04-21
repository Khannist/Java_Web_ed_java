package ch12;

public class Person {
	//final, 최종적인 필드, 중간에 수정 불가!
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
