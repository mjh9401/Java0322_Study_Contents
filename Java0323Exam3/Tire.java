package Java0323Exam3;

public class Tire {
	//필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	//생성사
	public Tire(String location,int maxRocation) {
		this.location = location;
		this.maxRotation = maxRocation;
	}
	
	//메서드
	public boolean roll() {
		++accumulatedRotation; // 누적 회적수 1증가
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+"Tire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("*** "+location+" Tire 펑크***");
			return false;
		}
	}
}
