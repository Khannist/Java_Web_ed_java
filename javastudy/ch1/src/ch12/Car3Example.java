package ch12;

public class Car3Example {

	public static void main(String[] args) {
		Car3 mycar = new Car3();
		
		mycar.setSpeed(-50);
		System.out.println("현재 속도 : " + mycar.getSpeed());
		
		mycar.setSpeed(600);
		System.out.println("현재 속도 : " + mycar.getSpeed());
		
		if (!mycar.isStop()) {
			mycar.setStop(true);
		}
		
		System.out.println("현재 속도 : " + mycar.getSpeed());
		System.out.println("현재 상태 : " + mycar.isStop());
	
		
		/*
		 9라인 mycar.setSpeed(-50); 에서 비정상적인 속도값으로 변경 시도하지만,
		 speed 필드의 setSpeed()에서 매개값을 검사한 후 0으로 변경하기 때문에
		 return값은 0으로 나온다.
		 
		 15번 라인 if (!mycar.isStop())에서 stop 필드의 isStop() 리턴값이
		 false 일경우, 자동차를 멈추기 위해서 setStop()를 호출해서 stop 필드의
		 true로, speed를 0으로 변경한다.		 
		 */
	}

}
