package Java0323Exam3;

public class KumhoTire extends Tire {
	//������
	public KumhoTire(String location, int maxRocation) {
		super(location, maxRocation);
	}
	
	//�޼���
	public boolean roll() {
		++accumulatedRotation; // ���� ȸ���� 1����
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+"KumhoTire ����: "+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		} else {
			System.out.println("*** "+location+" KumhoTire ��ũ***");
			return false;
		}
	}
}
