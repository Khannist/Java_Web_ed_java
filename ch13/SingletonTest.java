//package ch13;
//
//class Singleton {
//	private static Singleton instance;
//
//	private Singleton() {
//	}
//
//	public static Singleton getInstance() {
//		if (instance == null) {
//			System.out.println("create instance");
//			instance = new Singleton();
//		}
//		return instance;
//	}
//
//}
//
//public class SingletonTest {
//
//	public static void main(String[] args) {
//		Singleton instance1 = Singleton.getInstance();
//		Singleton instance2 = Singleton.getInstance();
//		System.out.println("instance1/instance2 :" + (instance1 == instance2));
//	}
//
//}
