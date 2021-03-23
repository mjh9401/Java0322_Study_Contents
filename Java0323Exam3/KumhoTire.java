package Java0323Exam3;

public class KumhoTire extends Tire {
	//생성자
	public KumhoTire(String location, int maxRocation) {
		super(location, maxRocation);
	}
	
	//메서드
	public boolean roll() {
		++accumulatedRotation; // 누적 회적수 1증가
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+"KumhoTire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("*** "+location+" KumhoTire 펑크***");
			return false;
		}
	}
}
