package ch12;

public class DmbCellPhone extends CellPhone{

	int channel;
	
	DmbCellPhone (String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.printf("채널 %d번 DMB 방송 수신을 시작합니다.",channel);
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.printf("채널 %d번으로 바꿉니다.\n",channel);
	}
	
	void turnOffDmb() {
		System.out.println("DMB를 종료합니다.");
	}

}
