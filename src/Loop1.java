/**
* for문 / while문
* @author smart02
* 1부터 10까지 출력
*/
public class Loop1 {

	public static void main(String[] args) {
		{for (int i=1; i<=10; i++) {
			System.out.printf("i의 값은 %d입니다.\n", i);
			}
		}
		System.out.println("====== for ======");
		{for (int k=1; k<=10; ++k) {
			System.out.printf("k의 값은 %d입니다.\n", k);
		}
		}
		System.out.println("====== for ======");
		{
			int j=1;
			while (j<=10) {
			System.out.printf("j의 값은 %d입니다.\n", j);
			j++;
			}
		}
		System.out.println("====== while ======");
		{
			int l=1;
			while (l<=10) {
			System.out.printf("l의 값은 %d입니다.\n", l);
			++l;
			}
		}
		System.out.println("============");
		{
			// do ~ while: 초기값을 주고 돌리는 것.
			int i = 1;
			do {
				System.out.println(i + ". joker");
				i++;
			} while (i<=5);
				
		}
		System.out.println("===== for =======");
		{
			// 1부터 10까지 합의 계산과정을 출력하시오.
			int sum=0;
			for (int m = 1; m <= 100; m++) {
				 System.out.println(sum); 
				sum+=m;
			}
			System.out.println("============");
			System.out.println(sum); // 결과값만 출력.
		}	
	}
}



