package Java0323Exam3;

public class Tire {
	//�ʵ�
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	//������
	public Tire(String location,int maxRocation) {
		this.location = location;
		this.maxRotation = maxRocation;
	}
	
	//�޼���
	public boolean roll() {
		++accumulatedRotation; // ���� ȸ���� 1����
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+"Tire ����: "+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		} else {
			System.out.println("*** "+location+" Tire ��ũ***");
			return false;
		}
	}
}
