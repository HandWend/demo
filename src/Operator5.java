
public class Operator5 {

	public static void main(String[] args) { // country
		// 대입연산자 (=, +=, -=, *=, /=, %= ...)
		System.out.println("--------------------------");
		{	
			// += 연산자
			int x = 1, y = 2;
			// x = x + y;
			x+=y;
			System.out.println(x);	
		}
		{
			// -= 연산자
			int x = 1, y = 2;
			// x = x -y;
			x-=y;
			System.out.println(x);	
		}
		{
			// 삼항연산자 (조건문) ? 참:거짓;
			// 시험성적이 60점 미만이면 재시험, 이상이면 통과
			int score = 100;
			String str = (score < 60) ? "재시험" : "Pass";
			System.out.println(str);	
			
		}	
	}

}
