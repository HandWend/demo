
public class Operator4 {

	public static void main(String[] args) { // country
		{	// 산술 > 비교 > 논리 > 대입
			// 단항 > 이항 > 삼항
			// 증감연산자 ++, --
			int i = 0;
			i++; // 후위연산자
			i++; 
			System.out.println(i);
			++i; // 전위연산자
			System.out.println(i);
		}
		{
			int i = 0;
			System.out.println("--------------------------");
			System.out.println(i++);
			System.out.println(i);
			System.out.println(i++);
			System.out.println(i);
			System.out.println(++i);
			System.out.println(i++);
			System.out.println(i);
		}
		{
			int i = 0, j = 1;
			System.out.println("--------------------------");
			System.out.println(i++ + i + ++j);
		}
		{
			int i = 0;
			System.out.println("--------------------------");
			System.out.println(++i);
			System.out.println(i++); 
			System.out.println(i);
		}
		{
			// 부정연산자 !
			boolean b = false;
			System.out.println("--------------------------");
			System.out.println(b);
			System.out.println(!b);
			
		}
		{
			// 비교연산자 >, >=, <, <=, ==, != 결과는 boolean type
			int m = 10, n = 5;
			System.out.println("--------------------------");
			System.out.println(m > n);
			System.out.println(m >= n);
			System.out.println(m < n);
			System.out.println(m <= n);
			System.out.println(m == n);
			System.out.println(m != n);
		}
		{
			// 논리연산자 ( and[&&] or[[||] nor[!] )
			// &&: 둘다 true일 때만 true
			// ||: 하나가 true면 true
			// ^: 하나만 true여야 true
			System.out.println("--------------------------");
			System.out.println(false && false);
			System.out.println(false && true);
			System.out.println(true && false);
			System.out.println(true && true);
		}
		{
			System.out.println("--------------------------");
			System.out.println(false || false);
			System.out.println(false || true);
			System.out.println(true || false);
			System.out.println(true || true);
		}
		{
			System.out.println("--------------------------");
			System.out.println(false ^ false);
			System.out.println(false ^ true);
			System.out.println(true ^ false);
			System.out.println(true ^ true);
		}
		{
			System.out.println("--------------------------");
			System.out.println(!false);
			System.out.println(!true);
		}
		{
			System.out.println("--------------------------");
			System.out.println(false && false);
			System.out.println(false && true);
			System.out.println(true && false);
			System.out.println(true && !true);
		}
		{
			// 비트연산자 &(and) |(or) ^(nor) ~(not) <<(shift) >> >>>
			// &: 둘 다 1일 때만 1
			// |: 1이 하나라도 있으면 1
			// ^: 1이 하나만 있어야 1, 2개 있으면 0, 없어도 0
			byte bitNum1 = 15;
			byte bitNum2 = 20; // 비트연산자에 byte로
			System.out.println("--------------------------");
			System.out.println(bitNum1 + bitNum2);
			System.out.println(bitNum1 & bitNum2);
			System.out.println(bitNum1 | bitNum2);
			System.out.println(~bitNum1); // 1의 보수(?)
			System.out.println(~bitNum2); // 기존값 +1 후 (-) 기호 앞으로.
			System.out.println(bitNum1 ^ bitNum2);
			System.out.println("--------------------------");
			System.out.println(bitNum2<<1); // 곱하기 2 '한 번'
			System.out.println(bitNum2>>1); // 나누기 2 '한 번'
			System.out.println(bitNum2<<2); // 곱하기 2 '두 번'
			System.out.println(bitNum2>>2); // 나누기 2 '두 번'
			System.out.println(bitNum2 >>> 1);
			System.out.println(~bitNum2 >>> 1);
		}
	}

}
