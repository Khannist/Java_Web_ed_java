package ch14;

class Parent {
	protected String name;

	public void printInfo() {
		System.out.println("name : " + name);
	}

}

class Child extends Parent {
	private String hobby;

	@Override // 어노테이션을 표기해주면 오버라이딩시 에러나오면 컴파일 에러 표시해줌
	public void printInfo() {
		System.out.println("name : " + name);
		System.out.println("hobby : " + hobby);
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}

public class ChildExample {

	public static void main(String[] args) {
		Parent p = new Parent();

		p.name = "parent";
		p.printInfo();

		System.out.println("------------------------");

		Child c = new Child();
		c.name = "child";
		c.setHobby("swimming");

		c.printInfo();
	}

}
