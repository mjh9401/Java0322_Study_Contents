package Java0323Exam5;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child(); // �ڵ� Ÿ�Ժ�ȯ
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child child = (Child)parent; // ����Ÿ�Ժ�ȯ
		child.field2="data2";
		child.method3();
		
		Parent parents = new Parent();
		if(parents instanceof Child) {
			Child child2 = (Child)parents;
			System.out.println("��ȯ����");
		} else {
			System.out.println("��ȯ����");
		}
	}
}
