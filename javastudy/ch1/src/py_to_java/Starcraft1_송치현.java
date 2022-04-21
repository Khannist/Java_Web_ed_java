//package py_to_java;
//
//class Unit {
//	public String name;
//	public int hp;
//	public int damage;
//
//	public Unit(String name, int hp, int damage) {
//		this.name = name;
//		this.hp = hp;
//		this.damage = damage;
//		System.out.println(name + "유닛이 생성되었습니다.");
//		System.out.println("체력 " + hp + ",공격력" + damage);
//	}
//}
//
//class AttackUnit extends Unit {
//	public AttackUnit(String name, int hp, int damage) {
//		super(name, hp, damage);
//	}
//	void attack(String location) {
//		System.out.println(name + " : " + location + " 방향으로 적군을 공격합니다. [공격력 " + damage + "]");
//	}
//	void damaged(int damage) {
//		System.out.println(name + " : " + damage + "데미지를 입었습니다.");
//		super.hp -= damage;
//		System.out.println(name + " : 현재 체력은 " + hp + " 입니다.");
//		if (super.hp <= 0)
//			System.out.println(name + " : 파괴되었습니다.");
//	}
//	
//}
//
//public class Starcraft1_송치현 {
//
//	public static void main(String[] args) {
//		AttackUnit firebat1 = new AttackUnit("파이어뱃", 50, 16);
//		firebat1.attack("5시");
//		
//		firebat1.damaged(25);
//		firebat1.damaged(25);
//	}
//
//}
