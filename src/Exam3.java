
public class Exam3 {
	// void --> int
	public int method(int m, int n) { 
		return m + n;
		
	}
	public static void main(String[] args) {
		// method() 내 타입에 맞게 변수 입력 
		int res = new Exam3().method(2, 3);
		// 출력값 res 추가
		System.out.println("2 + 3 = " + res);
	}
}
