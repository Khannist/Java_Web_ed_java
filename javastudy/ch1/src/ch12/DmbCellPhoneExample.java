package ch12;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("삼성폰", "검정", 10);
		
		
		System.out.printf("모델 : %s\n",dmbCellPhone.model);
		System.out.printf("색상 : %s\n",dmbCellPhone.color);
		System.out.printf("채널 : %d\n",dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("누구세요?");
		dmbCellPhone.sendVoice("옥수수염차");
		dmbCellPhone.receiveVoice("T.O.P 마스터 라떼");
		dmbCellPhone.sendVoice("맥심 에스프레소");
		dmbCellPhone.receiveVoice("킨더초콜릿");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(45);
	}

}
