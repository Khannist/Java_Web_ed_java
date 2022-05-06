//package py_to_java;
//
//class Unit {
//	public String name;
//	public int hp;
//	public int speed;
//	
//	public Unit(String name, int hp, int speed) {
//		this.name = name;
//		this.hp = hp;
//		this.speed = speed;
//		System.out.println(name + "유닛이 생성되었습니다.");
//	}
//	void move (String location) {
//		System.out.println(name + " : " + location + " 방향으로 이동합니다 [속도" + speed + "]");
//	}
//	
//	void damaged(int damage) {
//		System.out.println(name + " : " + damage + "데미지를 입었습니다.");
//		hp -= damage;
//		System.out.println(name + " : 현재 체력은 " + hp + " 입니다.");
//		if (hp <= 0)
//			System.out.println(name + " : 파괴되었습니다.");
//	}
//}
//
//class AttackUnit extends Unit {
//	public int damage;
//	public AttackUnit(String name, int hp, int speed, int damage) {
//		super(name, hp, speed);
//	}
//	void attack(String location) {
//		System.out.println(name + " : " + location + " 방향으로 적군을 공격합니다. [공격력" + damage + "]");
//	}
//	
//}
//
//interface Flyable {
//	
//	default void Flyable (int flying_speed) {
//	}
//	
//	default void fly(String name, String location) {
//	}
//}
//
//class FlyableAttackUnit extends AttackUnit implements Flyable{
//	
//	FlyableAttackUnit(String name, int hp,int speed, int damage) {
//		super(name, hp,speed, damage);
//	}
//	
//	@Override
//	public void Flyable (int flying_speed){
//		this.speed = flying_speed;
//	}
//	@Override
//	public void fly(String name, String location) {
//		System.out.println(name + " : " + location + "방향으로 날아갑니다. [속도" + speed + "]");
//	}
//	
//	void move(String location) {
//		fly(name, location);
//	}
//	
//}
//
//public class Starcraft4_송치현 {
//	public static void main(String[] args) {
//		FlyableAttackUnit wraith1 = new FlyableAttackUnit("레이스", 200, 6, 5);
//		wraith1.fly(wraith1.name, "3시");
//		wraith1.attack("3시");
//		wraith1.damaged(120);
//		wraith1.damaged(120);
//		
//		AttackUnit vulture = new AttackUnit("벌쳐", 80, 10, 20);
//		vulture.move("11시");
//		
//		FlyableAttackUnit battlecruiser = new FlyableAttackUnit("배틀크루저", 500, 25, 3);
//		battlecruiser.move("9시");
//		
//		AttackUnit marine = new AttackUnit("마린", 50, 5 ,5);
//		Unit medic = new Unit("매딕", 60, 5);
//		
//		marine.move("3시");
//		medic.move("3시");
//	}
//}
