package Java0323Exam2;

public abstract class Animal {
	public String kind;  //�ʵ�
	
	public void breath() { // �޼ҵ� ����
		System.out.println("���� ���ϴ�.");
	}
	
	public abstract void sound(); // �߻�޼ҵ�
}
