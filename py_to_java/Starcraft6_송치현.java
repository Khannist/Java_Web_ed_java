package py_to_java;

class Unit {
	static String name = "";
	static int hp = 0;
	static int speed = 0;

	public Unit() {
		if (name == null)
			System.out.println();
		else
			System.out.println(name + "유닛이 생성되었습니다.");
	}

	void move(String location) {
		System.out.println(name + " : " + location + " 방향으로 이동합니다 [속도" + speed + "]");
	}

	void damaged(int damage) {
		System.out.println(name + " : " + damage + "데미지를 입었습니다.");
		this.hp -= damage;
		System.out.println(name + " : 현재 체력은 " + hp + " 입니다.");
		if (hp <= 0)
			System.out.println(name + " : 파괴되었습니다.");
	}
}

class AttackUnit extends Unit {
	static int damage = 0;

	public AttackUnit() {
	}

	void attack(String location) {
		System.out.println(super.name + " : " + location + " 방향으로 적군을 공격합니다. [공격력" + damage + "]");
	}

}

interface Flyable {

	default void Flyable(int flying_speed) {
	}

	default void fly(String location) {
	}
}

class FlyableAttackUnit extends AttackUnit implements Flyable {

	FlyableAttackUnit() {
		if (name == null)
			System.out.println();
		else
			System.out.println(name + "유닛이 생성되었습니다.");
	}

	@Override
	public void Flyable(int flying_speed) {
		this.speed = flying_speed;
	}

	@Override
	public void fly(String location) {
		System.out.println(super.name + " : " + location + "방향으로 날아갑니다. [속도" + speed + "]");
	}

	void move(String location) {
		fly(location);
	}

}

class Wraith extends FlyableAttackUnit {
	boolean clocked;

	Wraith() {
		this.name = "레이스";
		hp = 80;
		speed = 20;
		damage = 5;
		clocked = false;
	}

	void clocking() {
		if (name.equals("레이스")) {
			if (clocked == true) {
				System.out.println("클로킹 모드를 해제합니다.");
				clocked = false;
			} else {
				System.out.println("클로킹 모드를 해제합니다.");
				clocked = true;
			}
		}
	}
}

class Marine extends AttackUnit {
	boolean stimpack;

	Marine() {
		super.name = "마린";
		super.hp = 40;
		super.speed = 1;
		super.damage = 5;
	}

	void stimpack() {
		if (super.name.equals("마린")) {
			if (hp > 10) {
				hp -= 10;
				System.out.printf("%s : 스팀팩을 사용합니다 (hp 10 감소)\n", super.name);
			} else
				System.out.printf("%s : 체력이 부족하여 스팀팩을 사용하지 않습니다.\n", super.name);
		}
	}
}

class Tank extends AttackUnit {
	boolean seize_developed;

	Tank() {
		name = "탱크";
		hp = 200;
		speed = 1;
		damage = 35;
		seize_developed = false;
	}

	void set_seize_mode() {
		if (name.equals("탱크")) {
			if (seize_developed == false) {
				System.out.printf("%s : 시즈모드로 전환합니다.\n", super.name);
				damage *= 2;
				seize_developed = true;
			} else {
				System.out.printf("%s : 시즈모드를 해제합니다.\n", super.name);
				damage /= 2;
				seize_developed = false;
			}
		}
	}
}

public class Starcraft6_송치현 {

	public static void main(String[] args) {
		Marine marine1 = new Marine();
		Marine marine2 = new Marine();
		Marine marine3 = new Marine();
		Tank tank1 = new Tank();
		Tank tank2 = new Tank();
		Wraith wraith1 = new Wraith();

		marine1.move("3시");
		marine2.move("3시");
		marine3.move("3시");
		tank1.attack("10시");
		tank1.set_seize_mode();
		tank1.attack("10시");
		tank1.set_seize_mode();
		wraith1.clocking();
		wraith1.fly("12시");

	}
}
