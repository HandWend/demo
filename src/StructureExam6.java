/**
 * 성적처리프로그램 
 * @author smart00
 * 함수에 전달할 때 하나를 전달해도 니가 알아서 다 받아라.
 * 함수가 복사가 된다고??
 */
public class StructureExam6 {
	//멤버변수, 필드
	String stdName;
	String grade;
	int coding;
	int age;
	
	public static void main(String[] args) {
		StructureExam6 se0 = new StructureExam6();
		se0.stdName = "홍길동";
		se0.coding = 100;
		se0.age = 1000;
		se0.grade = "A+";
		print(se0);
		
		StructureExam6 se1 = new StructureExam6();
		se1.stdName = "안명진";
		se1.coding = 90;
		se1.age = 50;
		se1.grade = "A";
		print(se1);
		
		StructureExam6 se2 = new StructureExam6();
		se2.stdName = "이순신";
		se2.coding = 95;
		se2.age = 500;
		se2.grade = "A";
		print(se2);
		
		StructureExam6 se3 = new StructureExam6();
		se3.stdName = "신사임당";
		se3.coding = 95;
		se3.age = 300;
		se3.grade = "A";
		print(se3);
		
		StructureExam6 se4 = new StructureExam6();
		se4.stdName = "이이";
		se4.coding = 95;
		se4.age = 250;
		se4.grade = "A";
		print(se4);  
	}

	private static void print(StructureExam6 se) {
		System.out.println(se.stdName+"의 코딩성적은 "+ se.coding +"점입니다.");
		System.out.println("수강생의 나이는 " + se.age);
		System.out.println("수강생의 평점은 " + se.grade);
		System.out.println();
	}

}




