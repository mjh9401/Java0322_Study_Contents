package Java0323Exam5;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child(); // 자동 타입변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child child = (Child)parent; // 강제타입변환
		child.field2="data2";
		child.method3();
		
		Parent parents = new Parent();
		if(parents instanceof Child) {
			Child child2 = (Child)parents;
			System.out.println("변환성공");
		} else {
			System.out.println("변환실패");
		}
	}
}
