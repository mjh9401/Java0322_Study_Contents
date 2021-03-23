package Java0323Exam3;

public class HankookTire extends Tire {
	//생성자
	public HankookTire(String location, int maxRocation) {
		super(location, maxRocation);
	}
	
	//메서드
	public boolean roll() {
		++accumulatedRotation; // 누적 회적수 1증가
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+"HankookTire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("*** "+location+" HankookTire 펑크***");
			return false;
		}
	}
}
