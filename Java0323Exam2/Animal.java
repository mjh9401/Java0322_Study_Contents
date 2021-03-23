package Java0323Exam2;

public abstract class Animal {
	public String kind;  //필드
	
	public void breath() { // 메소드 선언
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); // 추상메소드
}
