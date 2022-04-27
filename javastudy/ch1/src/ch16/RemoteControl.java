package ch16;

public interface RemoteControl {
	public int MAX_VOLUME = 10; // 상수 필드 static final 생략가능하다. 대문자
	public int MIN_VOLUME = 0;

	public void turnOn(); // abstract 생략이 가능하다.

	public void turnOff();

	public void setVolume(int volume);
}
